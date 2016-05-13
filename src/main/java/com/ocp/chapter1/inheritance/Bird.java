package com.ocp.chapter1.inheritance;

/**
 * Created by KV on 5/12/2016.
 */
public class Bird extends Living {

    private boolean living;

    @Override
    public boolean isLiving() {
        return this.living;
    }

    @Override
    public void setLiving(boolean living) {
        this.living = living;
    }

    public static void main(String... args) {
        Living b = new Bird();
        b.setLiving(true);
        System.out.println(((Living) b).isLiving());

        b = new Living();
        System.out.println(b.isLiving());
    }
}
