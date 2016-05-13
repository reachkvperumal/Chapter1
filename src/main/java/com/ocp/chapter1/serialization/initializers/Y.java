package com.ocp.chapter1.serialization.initializers;

/**
 * Created by KV on 5/12/2016.
 */
public class Y extends X {

    private static final long serialVersionUID = 1752279689682647437L;

    private final String name;

    public Y(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
