package com.ocp.chapter2;

/**
 * Created by KV on 5/11/2016.
 */
@FunctionalInterface
public interface A {

    public void show1();

    default void show() {
        System.out.println("FROM INTERFACE A");
    }

    static void print() {
        System.out.println("PRINT FROM INTERFACE A");
    }
}
