package com.ocp.chapter2.design;

/**
 * Created by KV on 6/1/2016.
 */
public class TestInterface implements Climb, Walk {

    @Override
    public boolean isTooHigh(int height, int limit) {
        return false;
    }

    public static void eatGrass() {
        System.out.println("eating grass from this class");
    }

    @Override
    public void status() {
        eatGrass();
        Climb.eatGrass();
        Climb.super.status();
        Walk.super.status();
        System.out.println("Climbing from TestInterface class");
    }


    public static void main(String... args) {
        Climb climb1 = new TestInterface();
        climb1.status();

        Walk walk = new TestInterface();
        walk.status();
    }
}
