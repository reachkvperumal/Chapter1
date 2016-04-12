package com.ocp.chapter1.sub1;

import com.ocp.chapter1.Tutorial;

/**
 * Created by KV on 4/11/2016.
 */
public class Derived extends Tutorial {
    public static void main(String[] args) {
        Tutorial obj = new Derived();
        Derived obj1 = new Derived();

        System.out.println(obj1.favoriteCaptian);

    }
}
