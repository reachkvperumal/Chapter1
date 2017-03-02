package com.ocp.overloading;

/**
 * Created by KV on 3/1/2017.
 */
public class Rule11 {
    /**
     * Unboxing an object will be chosen ahead of widening (e.g. unboxing an Integer to an int will be chosen ahead of widening to a Object).
     */
    public Rule11(int i) {
        System.out.println("Unboxing an object will be chosen ahead of widening (e.g. unboxing an Integer to an int will be chosen ahead of widening to a Object).");
    }

    public Rule11(Object o) {
        System.out.println("This will not be executed");
    }

    public static void main(String... args) {
        new Rule11(Integer.MAX_VALUE);
    }
}
