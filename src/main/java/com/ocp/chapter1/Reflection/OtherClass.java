package com.ocp.chapter1.Reflection;

/**
 * Created by KV on 4/30/2016.
 */
public class OtherClass {
    private final int value;
    private final int unknownValue;

    private OtherClass() {
        System.out.println("test");
        this.value = 10;
        this.unknownValue = 20;
    }
}
