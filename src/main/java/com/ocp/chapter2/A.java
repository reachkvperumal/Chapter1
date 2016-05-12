package com.ocp.chapter2;

/**
 * Created by KV on 5/11/2016.
 */
public interface A {

    default void show() {
        System.out.println("FROM INTERFACE A");
    }
}
