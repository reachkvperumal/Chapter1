package com.ocp.overloading;

/**
 * Created by KV on 3/1/2017.
 */
public class Rule8And9 {
    /**
     * Wrapper types cannot be unboxed but not then widened (e.g. an Integer can be unboxed to an int).
     * Wrapper types cannot be unboxed and widened (e.g. a Byte can be unboxed to a byte and then widened to an int).
     */
    public Rule8And9(int i) {
        System.out.println("Wrapper types cannot be unboxed but not then widened (e.g. an Integer can be unboxed to an int).");
        System.out.println("Wrapper types cannot be unboxed and widened (e.g. a Byte can be unboxed to a byte and then widened to an int).");
    }

    public static void main(String... args) {
        new Rule8And9(new Integer(100));
        new Rule8And9(Integer.MAX_VALUE);
        new Rule8And9(Byte.MAX_VALUE);
    }
}
