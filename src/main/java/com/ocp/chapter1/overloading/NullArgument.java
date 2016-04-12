package com.ocp.chapter1.overloading;

/**
 * Created by KV on 4/11/2016.
 */
public class NullArgument {
    public static void main(String[] args) {

        NullArgument obj = new NullArgument();
        obj.overLoad(null);
    }

    private void overLoad(Object o) {
        System.out.println("Object o argument method.");
    }

    private void overLoad(double[] dArray) {
        System.out.println("double array argument method.");
    }
}
