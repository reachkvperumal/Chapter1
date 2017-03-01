package com.ocp.chapter1;

/**
 * Created by KV on 4/11/2016.
 */
public class AnotherClass {

    protected boolean hasFur = true;

    public static void main(String[] args) {
        Tutorial obj = new Tutorial();
        System.out.println(obj.bestCaptain);
        System.out.println(obj.favoriteCaptian);
        AnotherClass anotherClass = new AnotherClass();
        System.out.println(anotherClass.hasFur);
    }
}
