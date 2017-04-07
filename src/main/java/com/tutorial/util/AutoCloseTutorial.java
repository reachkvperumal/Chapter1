package com.tutorial.util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KV on 4/4/2017.
 */
public class AutoCloseTutorial implements AutoCloseable {

    @Override
    public void close() throws RuntimeException {
        System.out.println("2.Inside Auto Close...");
    }

    public void execute() {
        System.out.println("1.Inside execute....");
    }

    public void test() {
        try (
                AutoCloseTutorial tutorial1 = new AutoCloseTutorial();
                AutoCloseTutorial tutorial2 = new AutoCloseTutorial();
        ) {
            tutorial1.execute();
            tutorial2.execute();
        } finally {
            System.out.println("3.inside finally...");
        }
    }

    static void init(List<? extends String> list, List<? super String> list1) {
        System.out.println(list);
        System.out.println(list1);
    }

    public static void main(String[] args) {
        //new AutoCloseTutorial().test();
        List<String> test = new ArrayList<>();
        test.add("TEST");
        List<String> test1 = new ArrayList<>();
        test1.add("TEST");
        init(test, test1);

    }
}

