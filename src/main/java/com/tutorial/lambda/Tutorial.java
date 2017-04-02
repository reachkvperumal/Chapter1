package com.tutorial.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KV on 3/30/2017.
 */
public class Tutorial {

    public static void main(String[] args) {
        String[] names = {"Peter", "Paul", "Mary"};
        List<Runnable> runners = new ArrayList<>();
        for (String name : names)
            runners.add(() -> System.out.println(name));

        runners.stream().forEach(Runnable::run);
    }
}
