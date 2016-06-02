package com.ocp.chapter2.design;

/**
 * Created by KV on 6/1/2016.
 */
public class Derived extends Base {

    public Derived() {
        super();
    }

    @Override
    public String getName() {
        return "Derived Test";
    }
}
