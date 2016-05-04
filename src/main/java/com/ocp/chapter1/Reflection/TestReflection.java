package com.ocp.chapter1.Reflection;

import sun.reflect.ReflectionFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;

/**
 * Created by KV on 4/29/2016.
 */
public class TestReflection {

    private static void copy() {
        try {
            Constructor cons = ReflectionFactory.getReflectionFactory()
                    .newConstructorForSerialization(Dummy1.class, Dummy2.class.getDeclaredConstructor());
            cons.setAccessible(true);

            Dummy1 instance = (Dummy1) cons.newInstance();
            System.out.println(instance.getfName());
            assertEquals("SPRING", instance.getfName());
            assertEquals(Dummy1.class, instance.getClass());
            assertEquals(Object.class, instance.getClass().getSuperclass());
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }


    public static void testStrangeReflectionFactory() {
        try {
            Constructor silentConstructor = ReflectionFactory.getReflectionFactory()
                    .newConstructorForSerialization(ClassWithExpensiveConstructor.class,
                            OtherClass.class.getDeclaredConstructor());
            silentConstructor.setAccessible(true);
            ClassWithExpensiveConstructor instance =
                    (ClassWithExpensiveConstructor) silentConstructor
                            .newInstance();
            assertEquals(10, instance.getValue());
            assertEquals(ClassWithExpensiveConstructor.class, instance.getClass());
            assertEquals(Object.class, instance.getClass().getSuperclass());
            System.out.println("SUCCESS");

        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        //  copy();
        testStrangeReflectionFactory();
    }
}
