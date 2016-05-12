package com.ocp.chapter2;

/**
 * Created by KV on 5/11/2016.
 */
public class AImpl implements A {
    public static void main(String... args) {
        new AImpl().show();
        A.print();
    }

    @Override
    public void show1() {
        A.super.show();
        System.out.println("FROM CLASS");
    }
}
