package com.ocp.generic;

/**
 * Created by KV on 3/2/2017.
 */
public class AnimalImpl extends Animal {

    public AnimalImpl() {
        System.out.println("FROM IMPL CLASS");
    }

    @Override
    final void show() {
        System.out.println("SHOW");
    }

    public static void main(String... args) {
        new AnimalImpl().show();
    }
}
