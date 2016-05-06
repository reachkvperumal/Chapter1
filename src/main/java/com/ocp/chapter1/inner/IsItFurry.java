package com.ocp.chapter1.inner;

/**
 * Created by KV on 5/5/2016.
 */
public class IsItFurry {
    static interface Mammal {
    }

    static class Furry implements Mammal {
    }

    static class Chipmunk extends Furry {
    }

    private void show() {
        System.out.println(equals(null));
    }

    public static void main(String... args) {
        Chipmunk c = new Chipmunk();
        Mammal m = c;
        Furry f = c;
        int result = 0;
        if (c instanceof Mammal)
            result += 1;
        if (c instanceof Furry)
            result += 2;
        if (null instanceof Chipmunk)
            result += 4;
        System.out.println(result);

        new IsItFurry().show();


    }


}
