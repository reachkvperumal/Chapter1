package com.ocp.chapter2.design;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KV on 5/12/2016.
 */
public final class Person {

    private final String name;

    private final List<String> favorite;

    public Person(String name, List<String> favorite) {
        this.name = name;
        this.favorite = new ArrayList<>(favorite);
    }

    public String getName() {
        return name;
    }

    public List<String> getFavorite() {
        return favorite;
    }
}
