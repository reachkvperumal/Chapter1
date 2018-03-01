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

    static void go(long x) { System.out.println("Long"); }

    public static void main(String... args) {
       // new Rule8And9(new Integer(100));
      //  new Rule8And9(Integer.MAX_VALUE);
        new Rule8And9(new Byte("127"));
        byte b = 5;
        go(b);
        new Rule8And9(b);
    }
}
