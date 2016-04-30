package com.ocp.chapter1.Reflection;

/**
 * Created by KV on 4/29/2016.
 */
public class Dummy2 {
    private final String fName;

    private final String lName;

    private Dummy2() {
        this.fName = "SPRING";
        this.lName = "4.1";
    }

    public Dummy2 getDummy1() {
        return this;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }
}
