package com.ocp.overloading;

/**
 * Created by KV on 3/1/2017.
 */
public class Rule6 {

    /**
     * Primitive types can be boxed and then widened (e.g. an int can be boxed as an Integer and then widened to an Object).
     */
    public Rule6(Object o) {
        System.out.println("Primitive types can be boxed and then widened (e.g. an int can be boxed as an Integer and then widened to an Object).");
    }

    public static void main(String... args) {
        new Rule6((int) 6);
    }
}
