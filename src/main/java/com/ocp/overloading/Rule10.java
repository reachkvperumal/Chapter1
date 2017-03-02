package com.ocp.overloading;

/**
 * Created by KV on 3/1/2017.
 */
public class Rule10 {
    /**
     * Widening a primitive type will be chosen ahead of boxing (e.g. widening a byte to an int will be chosen ahead of boxing to a Byte).
     */
    public Rule10(int i) {
        System.out.println("Widening a primitive type will be chosen ahead of boxing (e.g. widening a byte to an int will be chosen ahead of boxing to a Byte).");
    }

    public Rule10(Byte b) {
        System.out.println("This will not be executed");
    }

    public static void main(String... args) {
        new Rule10((byte) 1);
    }
}
