package com.ocp.chapter1.learnenum;

/**
 * Created by KV on 5/5/2016.
 */
public enum Season {
    WINTER, SPRING, SUMMER, FALL;

    public static void main(String... args) {
        for (Season season : Season.values()) {


            switch (season) {
                case SPRING:
                    System.out.println("INSIDE 1 " + season.ordinal() + ")" + season.name());
                    break;
                case FALL:
                    System.out.println("INSIDE 2 " + season.ordinal() + ")" + season.name());
                    break;
                default:
                    System.out.println("INSIDE 3 " + season.ordinal() + ")" + season.name());
            }

        }
    }
}
