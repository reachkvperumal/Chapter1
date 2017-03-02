package com.ocp.overloading;

/**
 * Created by KV on 3/1/2017.
 */
public class Rule4And5 {

    /**
     * Wrapper types cannot be widened to another wrapper type (e.g. a Byte cannot widen to an Integer).
     * Primitive types can (since Java 5) be boxed (e.g. an int can be boxed as an Integer).
     */

    public Rule4And5(Integer integer) {
        System.out.println("Wrapper types cannot be widened to another wrapper type (e.g. a Byte cannot widen to an Integer).");
    }

    public Rule4And5(Object o) {
        System.out.println("For byte to Object is possible");
    }

    public static void main(String... args) {
        new Rule4And5(Byte.MAX_VALUE); // fails if Object constructor doesn't exist
        new Rule4And5((byte) 1); // fails if Object constructor doesn't exist
        new Rule4And5((int) 1);

    }
}
