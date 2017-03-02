package com.ocp.overloading;

/**
 * Created by KV on 3/1/2017.
 */
public class Rule1 {

    /*If there is an exact match between the number and types of arguments specified in the method call and
    the method signature of an overloaded method then that is the method that will be invoked.*/

    public Rule1(String s, int i) {
        System.out.println("FROM 2 ARGUMENT CONSTRUCTOR");
    }

    public static void main(String... args) {
        new Rule1("S", 1);
    }
}
