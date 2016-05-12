package com.ocp.chapter2;

/**
 * Created by KV on 5/11/2016.
 */
public class ABImpl implements A, B {

    public void show() {
        B.super.show();
    }

    public static void main(String... args) {
        A a = new ABImpl();
        a.show();
    }
}
