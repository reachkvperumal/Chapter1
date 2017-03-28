package com.tutorial.lambda;

/**
 * Created by KV on 3/27/2017.
 */
public class Family implements Father, Son {

    @Override
    public String getName() {
        return Son.super.getName();
    }

    public static void main(String[] args) {
        System.out.println(new Family().getName());
    }
}
