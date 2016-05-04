package com.ocp.chapter1.overloading;

/**
 * Created by KV on 4/13/2016.
 */
public class Base {

    int method(Object o) {
        return 1;
    }

    int method(Base a) {
        return 2;
    }
}
