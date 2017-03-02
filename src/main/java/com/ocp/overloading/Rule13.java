package com.ocp.overloading;

/**
 * Created by KV on 3/1/2017.
 */
public class Rule13 {
    /**
     * A method using varargs will only be chosen if is there is no other overloaded version that is applicable.
     */

    public Rule13(Integer... i) {
        System.out.println("A method using varargs will only be chosen if is there is no other overloaded version that is applicable.");
    }

    public static void main(String... args) {
        new Rule13(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.valueOf(12));
        new Rule13(1, 2, 1);
    }
}
