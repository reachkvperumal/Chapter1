package com.ocp.chapter1.Reflection;

/**
 * Created by KV on 4/29/2016.
 */
public class Dummy1 {

    private final String fName;

    private final String lName;

    private Dummy1() {
        this.fName = "JAVA";
        this.lName = "8.0";
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    @Override
    public String toString() {
        return "Dummy1{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}
