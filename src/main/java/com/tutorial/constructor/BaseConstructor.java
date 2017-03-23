package com.tutorial.constructor;

/**
 * Created by KV on 3/22/2017.
 */
public class BaseConstructor {

    protected int i = 10;

    public BaseConstructor() {
        System.out.println("DUMMY");
    }

    private BaseConstructor(int i) {
        System.out.println("INSIDE EMPTY CONSTRUCTOR");
    }


    public static void main(String[] args) {
        new BaseConstructor(10);
    }
}
