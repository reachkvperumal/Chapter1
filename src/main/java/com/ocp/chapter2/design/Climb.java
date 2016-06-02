package com.ocp.chapter2.design;

/**
 * Created by KV on 6/1/2016.
 */
interface Climb {

    abstract boolean isTooHigh(int height, int limit);

    public static void eatGrass() {
        System.out.println("eating grass");
    }

    public default void status() {
        System.out.println("Climbing");
    }

}
