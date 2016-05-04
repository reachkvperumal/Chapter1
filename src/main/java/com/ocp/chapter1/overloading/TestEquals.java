package com.ocp.chapter1.overloading;

/**
 * Created by KV on 5/3/2016.
 */
public class TestEquals {

    public static void main(String... args) {
        System.out.println(new Integer(5) == new Integer(5));
        System.out.println(new Integer(500) == new Integer(500));

        System.out.println(Integer.valueOf(5) == Integer.valueOf(5));
        System.out.println(Integer.valueOf(500) == Integer.valueOf(500));
    }
}
