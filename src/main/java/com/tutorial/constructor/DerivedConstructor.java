package com.tutorial.constructor;

/**
 * Created by KV on 3/22/2017.
 */
public class DerivedConstructor extends BaseConstructor {
    protected int i;

    public DerivedConstructor(int i) {
        System.out.println(super.i);
    }

    public static void main(String[] args) {
        new DerivedConstructor(10);
    }

}
