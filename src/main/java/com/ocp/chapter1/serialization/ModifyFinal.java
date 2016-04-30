package com.ocp.chapter1.serialization;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by KV on 4/29/2016.
 */
public class ModifyFinal {

    private static Unsafe getUnSafe() {
        Field unsafe = null;
        try {
            unsafe = Unsafe.class.getDeclaredField("theUnsafe");
            unsafe.setAccessible(true);
            return (Unsafe) unsafe.get(Unsafe.class);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }


    private static <T> T change(Class<T> clazz, T t, String[] v1) {

        Field[] fields = clazz.getDeclaredFields();

        try {
            for (Field f : fields) {
                f.setAccessible(true);
                System.out.println(f.get(t));
            }
            fields[0].set(t, v1[0]);
            fields[1].set(t, v1[1]);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return t;

    }

    public static void main(String[] args) {
        Person p1 = new Person("Dummy", "Dummy");
        System.out.println(p1);
        String[] values = {"JDK", "8.0"};
        System.out.println(change(Person.class, p1, values));

        System.out.println(getUnSafe().addressSize());
        System.out.println(System.clearProperty("java.version"));
    }

}
