package com.ocp.chapter1.overloading;

/**
 * Created by KV on 4/11/2016.
 */
public class LearnOverloading {

    private void show(double d) {
        System.out.println("THIS IS FROM DOUBLE " + d);
    }

    private void show(float f) {
        System.out.println("THIS IS FROM FLOAT " + f);
    }

    public static void main(String[] args) {
        LearnOverloading obj = new LearnOverloading();

        obj.show(10);
    }

}
