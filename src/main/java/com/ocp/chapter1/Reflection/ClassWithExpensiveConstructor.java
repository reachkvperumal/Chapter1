package com.ocp.chapter1.Reflection;

/**
 * Created by KV on 4/30/2016.
 */
public class ClassWithExpensiveConstructor {
    private final int value;

    private ClassWithExpensiveConstructor() {
        value = doExpensiveLookup();
    }

    private int doExpensiveLookup() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public int getValue() {
        return value;
    }
}
