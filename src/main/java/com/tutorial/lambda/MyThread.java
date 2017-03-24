package com.tutorial.lambda;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by KV on 3/23/2017.
 */
public class MyThread {

    public static void main(String[] args) {

        new Thread(() -> {
            System.out.println("zzzzz");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Short Nap... woke up now...");
        }).run();

        Callable<Void> callable = () -> {
            System.out.println("INSIDE CALLBLE");
            Thread.sleep(3000);
            System.out.println("CALLABLE WOKE UP...");
            return null;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(callable);
        if (!executorService.isShutdown()) {
            executorService.shutdown();
            System.out.println("Fixed Thread Executor Service shut down now...");
        }

        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(callable);
        if (!service.isShutdown()) {
            service.shutdown();
            System.out.println("Single Thread SHUT DOWN COMPLETE...");
        }


    }

}
