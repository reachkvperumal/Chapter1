package com.ocp.chapter1.overloading;

/**
 * Created by KV on 5/3/2016.
 */
public class OverloadingRules {

    private static void getCount(int i) {
        System.out.printf("FROM int PARAMETER %s", String.valueOf(i));
        System.out.println();
    }

    private static void getCount(Integer i) {
        System.out.printf("FROM INTEGER PARAMETER %s", i.toString());
        System.out.println();
    }

    private static void getCount(double i) {
        System.out.printf("FROM double PARAMETER %s", String.valueOf(i));
        System.out.println();
    }

    private static void getCount(Double i) {
        System.out.printf("FROM DOUBLE PARAMETER %s", i.toString());
        System.out.println();
    }


    private static void getCount(Object... i) {
        System.out.printf("FROM OBJECT VARARGS... ");
    }

    public static void main(String[] args) {
        getCount(Integer.MAX_VALUE);
        Integer[] i = {Integer.valueOf(1), Integer.valueOf(2)};
        getCount(i);
    }

}
