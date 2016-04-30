package com.ocp.chapter1.overloading;

/**
 * Created by KV on 4/13/2016.
 */
public class Derived extends Base {

    public int method(Base a) {
        return 3;
    }

    public int method(Derived ax) {
        return 4;
    }

    public static void main(String[] args) {

        Object o = new Base();
        Base a1 = new Base();
        Base a2 = new Derived();
        Derived ax = new Derived();

        System.out.println(a1.method(o));
        System.out.println(a2.method(a1));
        System.out.println(a2.method(o));
        System.out.println(a2.method(ax));
        System.out.println(ax.method(ax));


    }
}
