package com.tutorial.constructor;

/**
 * Created by KV on 3/22/2017.
 */
public enum Color {
    RED;

    @Override
    public String toString() {
        System.out.println(this instanceof Enum);
        return super.toString();
    }

    public static void main(String[] args) {
        System.out.println(Color.RED.toString());
    }

}
