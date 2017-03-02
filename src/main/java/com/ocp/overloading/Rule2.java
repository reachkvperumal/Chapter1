package com.ocp.overloading;

/**
 * Created by KV on 3/1/2017.
 */
public class Rule2 {

    /*Primitive types can be widened (e.g. a byte can widen to an int).*/

    public Rule2(int i) {
        System.out.println("Primitive types can be widened");
    }

    public static void main(String... args) {
        new Rule2((byte) 1);
    }
}
