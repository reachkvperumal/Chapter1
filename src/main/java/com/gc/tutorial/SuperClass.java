package com.gc.tutorial;

/**
 * Created by KV on 3/21/2017.
 */
public class SuperClass {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("in finalize() method of SuperClass, "
                + "doing cleanup activity SuperClass");
        try {
            System.out.println("in finalize() method of SuperClass, "
                    + "doing cleanup activity SuperClass");
        } catch (Throwable throwable) {
            throw throwable;
        }
    }
}
