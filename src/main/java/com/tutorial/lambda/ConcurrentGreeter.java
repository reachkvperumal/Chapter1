package com.tutorial.lambda;

/**
 * Created by KV on 3/23/2017.
 */
public class ConcurrentGreeter extends Greeter {
    @Override
    public void greet() {
        Thread t = new Thread(super::greet);
        t.start();
    }

    public static void main(String[] args) {
        ConcurrentGreeter obj = new ConcurrentGreeter();
        obj.greet();
    }
}
