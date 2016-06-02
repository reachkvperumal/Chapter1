package com.ocp.chapter2.design;

/**
 * Created by KV on 6/1/2016.
 */
public interface Walk {

    public default void status() {
        System.out.println("Walking");
    }
}
