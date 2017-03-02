package com.ocp.overloading;

/**
 * Created by KV on 3/1/2017.
 */
public class Rule7 {
    /**
     * Primitive types cannot be widened and then boxed (e.g. a byte cannot widen to an int and then be boxed as an Integer).
     */
    public Rule7(Integer i) {
        System.out.println("Primitive types cannot be widened and then boxed (e.g. a byte cannot widen to an int and then be boxed as an Integer).");
    }

    public static void main(String... args) {
        //new Rule7((byte)1); // will not compile
        new Rule7(null);
    }
}
