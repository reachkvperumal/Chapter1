package com.rbc.cm.risk.impl;

import com.google.gson.GsonBuilder;
import com.rbc.cm.risk.Utility;
import com.rbc.cm.risk.annotations.Sensitive;
import com.rbc.cm.risk.dto.Person;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.RegExUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.MethodUtils;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParseAnnotations {
    private static List<String> TYPES = List.of("String", "Class");

    static String hash(String src, String target) {
        if(StringUtils.isBlank(src))
            return "";
        return RegExUtils.replaceAll(src,"[^-](?=.{1})",target);
    }

    static List<Method> parseAnnotation(Class<?> cls) {
        Method[] methodsWithAnnotation = MethodUtils.getMethodsWithAnnotation(cls, Sensitive.class);
        List<Method> methods = Arrays.asList(methodsWithAnnotation);
        return methods;
    }

    static Map<String, String> parseMethodWithObjectAsReturn(Class<?> cls) {
        return Arrays.asList(cls.getMethods()).stream().filter(m -> !m.getReturnType().isPrimitive() && !TYPES.contains(m.getReturnType().getSimpleName()))
                .collect(Collectors.toMap(key -> key.getName(), v -> v.getReturnType().getTypeName()));
    }

    static String convertCase(String str) {
        char[] c = str.toCharArray();
        c[0] = Character.toLowerCase(c[0]);
        return new String(c);
    }

    static void parse(Object cls) {
        List<Method> methods = parseAnnotation(cls.getClass());
        methods.forEach(m -> {
                    String methodName = m.getName();
                    String str = convertCase(methodName.substring(3, methodName.length()));

                    try {
                        String property = BeanUtils.getProperty(cls, str);
                        BeanUtils.setProperty(cls, str, hash(property, "#"));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
        );
    }

    public static void main(String[] args) throws Exception {
        Person person = Utility.load();
        List<Method> methods = parseAnnotation(person.getClass());
        methods.forEach(m -> {
                    String methodName = m.getName();
                    String str = convertCase(methodName.substring(3, methodName.length()));

                    try {
                        String property = BeanUtils.getProperty(person, str);

                        BeanUtils.setProperty(person, str, hash(property, "#"));
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }

                }
        );

        Map<String, String> embeddedObjects = parseMethodWithObjectAsReturn(person.getClass());
        embeddedObjects.entrySet().stream().forEach(o -> {
            try {
                parse(MethodUtils.invokeMethod(person, o.getKey()));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(person));

    }


}
