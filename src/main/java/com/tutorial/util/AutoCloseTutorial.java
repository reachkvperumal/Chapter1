package com.tutorial.util;

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

    public static void main(String[] args) {
        new AutoCloseTutorial().test();
    }
}

