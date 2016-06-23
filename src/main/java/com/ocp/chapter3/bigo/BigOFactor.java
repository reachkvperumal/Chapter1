package com.ocp.chapter3.bigo;

/**
 * Created by KV on 6/22/2016.
 */
public class BigOFactor {

    private static int fibonacci(int i) {
        if (i <= 1) return i;
        return fibonacci(i - 2) + fibonacci(i - 1);
    }

    private static void fibonacciLoop(int i) {
        int x = 0;
        int y = 1;

        for (int loop = 0; loop < i; loop++) {
            x = x + y;
            y = x - y;
            System.out.println(x);
        }

    }

    private static int fibLoop(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int x = 1, y = 1, fibonacci = 1;
        for (int i = 3; i <= n; i++) {
            fibonacci = x + y;
            x = y;
            y = fibonacci;
        }
        return fibonacci;
    }

    public static void main(String... args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println(fibonacci(i));
        }
        System.out.println("---------------------------");
        fibonacciLoop(5);
        System.out.println("---------------------------");
        for (int i = 0; i <= 5; i++) {
            System.out.println(fibLoop(i));
        }
    }
}
