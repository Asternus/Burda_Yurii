package com.burda.hw25.hw32.hippodromeconcurrent;

import java.util.Random;
import java.util.concurrent.Callable;

public class Hippodrome implements Callable<String> {
    private final Random random = new Random();

    @Override
    public String call() throws Exception {
        final String name = Thread.currentThread().getName();
        final int sleep = random.nextInt(400, 500);
        try {
            for (int i = 0; i < 1000; i += 100) {
                if (i == random.nextInt(100, 200)) {
                    Thread.sleep(sleep);
                }
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return name;
    }
}
