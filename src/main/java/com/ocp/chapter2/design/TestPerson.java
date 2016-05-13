package com.ocp.chapter2.design;

import java.util.ArrayList;

/**
 * Created by KV on 5/12/2016.
 */
public class TestPerson {

    public static void main(String... args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("CAR");

        Person p = new Person("KV", list);
        System.out.println(p.getFavorite());
        list.add("BIKE");
        System.out.println(p.getFavorite());
    }
}
