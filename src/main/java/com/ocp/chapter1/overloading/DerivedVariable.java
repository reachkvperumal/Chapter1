package com.ocp.chapter1.overloading;

/**
 * Created by KV on 5/4/2016.
 */
public class DerivedVariable extends BaseVariable {
    public String name = "DERIVED";

    @Override
    public void showName() {
        System.out.println(this.name);
    }
}
