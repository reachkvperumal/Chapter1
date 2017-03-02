package com.ocp.overloading;

/**
 * Created by KV on 3/1/2017.
 */
public class Rule12 {
    /**
     * A primitive type will be widened to the smallest available primitive (e.g. widening a byte to an int will be choosen ahead of widening to a long).
     */
    public Rule12(int i) {
        System.out.println("A primitive type will be widened to the smallest available primitive (e.g. widening a byte to an int will be choosen ahead of widening to a long).");
    }

    public Rule12(long l) {
        System.out.println("This will not be executed");
    }

    public static void main(String... args) {
        new Rule12((byte) 1);
    }
}
