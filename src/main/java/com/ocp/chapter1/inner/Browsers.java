package com.ocp.chapter1.inner;

/**
 * Created by KV on 5/5/2016.
 */
public class Browsers {

    static class Browser {
        public void go() {
            System.out.println("Inside Browser");
        }
    }

    static class FireFox extends Browser {

        @Override
        public void go() {
            System.out.println("Inside FireFox");
        }

        public static void got() {
            System.out.println("FIRE FOX 31!!!");
        }
    }

    static class IE extends Browser {
        @Override
        public void go() {
            System.out.println("Inside IE");
        }
    }

    public static void main(String... args) {
        Browser b = new IE();
        // IE e = (IE)b;
        b.go();
        b = new FireFox();
        b.go();

        new IE().go();
        FireFox.got();
    }


}
