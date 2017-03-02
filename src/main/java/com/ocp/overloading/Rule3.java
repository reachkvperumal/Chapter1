package com.ocp.overloading;

/**
 * Created by KV on 3/1/2017.
 */
public class Rule3 {

    /*Objects can be widened (e.g. an Integer can be widen to an Object).*/
    public Rule3(Object o) {
        System.out.println("Objects can be widened (e.g. an Integer can be widen to an Object).");
    }

    public static void main(String... args) {
        new Rule3(Integer.MAX_VALUE);
    }
}
