package com.ocp.thread;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.*;

public class TestMap {

    /**
     * Learning concurrency
     *
     * @return int
     */
    private int execute(Map<String, Object> map) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);

        int nano = LocalDateTime.now().getNano();

        for (int i = 0; i < 4; i++) {
            fixedThreadPool.execute(() -> {
                for (int j = 0; j < 500_000; j++) {
                    int nextInt = ThreadLocalRandom.current().nextInt(1000);
                    String value = String.valueOf(nextInt);
                    map.put(value, nextInt);
                    map.get(value);
                }
            });
        }
        fixedThreadPool.shutdown();
        try {
            fixedThreadPool.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return LocalDateTime.now().getNano() - nano;
    }


    public static void main(String[] args) {
        TestMap map = new TestMap();
        int hashTableTime = map.execute(new Hashtable<String, Object>());
        int synchronizedHashMap = map.execute(Collections.synchronizedMap(new HashMap<String,Object>()));
        int concurrentHashMap = map.execute(new ConcurrentHashMap<String,Object>());

        System.out.printf("HASH_TABLE_TIME = %d%nSYNC_HASH_TABLE_TIME = %d%nCONCURRENT_HASH_MAP = %d%n",hashTableTime,synchronizedHashMap,concurrentHashMap);

    }

}
