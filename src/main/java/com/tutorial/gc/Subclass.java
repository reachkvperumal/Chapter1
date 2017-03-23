package com.tutorial.gc;

/**
 * Created by KV on 3/21/2017.
 */
public class Subclass {
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("in finalize() method of Subclass, "
                    + "doing cleanup activity of Subclass");
        } catch (Throwable throwable) {
            throw throwable;
        } finally {
            System.out.println("HELLO WORLD!!!!");
            super.finalize();
        }
    }

    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        System.out.println("in main() method");
        try {
            subclass.finalize(); //call finalize() method explicitly
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }
}
