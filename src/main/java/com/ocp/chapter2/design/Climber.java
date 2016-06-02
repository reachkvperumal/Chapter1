package com.ocp.chapter2.design;

/**
 * Created by KV on 6/1/2016.
 */
public class Climber {

    interface HasWings {
        public abstract Object getWingSpan();
    }

    public static void main(String... args) {
        int h1 = 4;

        check((h, l) -> true, 5);
    }

    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10))
            System.out.println("TOO HIGH");
        else
            System.out.println("OK");

        Climb.eatGrass();
    }
}
