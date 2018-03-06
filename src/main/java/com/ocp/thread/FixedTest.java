package com.ocp.thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class FixedTest {

    public void test(){

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(() -> System.out.printf("THREAD NAME & Time: %s -- %s%n", LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME), Thread.currentThread().getName()), 1L, 7L, TimeUnit.SECONDS);
        try {
            boolean awaitTermination = service.awaitTermination(5L, TimeUnit.SECONDS);
            if (!awaitTermination){
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FixedTest test = new FixedTest();
        test.test();
    }
}
