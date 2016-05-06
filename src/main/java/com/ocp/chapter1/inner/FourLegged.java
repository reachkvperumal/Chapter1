package com.ocp.chapter1.inner;

/**
 * Created by KV on 5/5/2016.
 */
public class FourLegged {
    String walk = "walk";

    static class BabyRihno extends FourLegged {
        String walk = "toddle";
    }

    public static void main(String... args) {
        FourLegged f = new BabyRihno();
        BabyRihno b = new BabyRihno();
        System.out.println(f.walk);
        System.out.println(b.walk);
    }
}
