package com.burda.module4.util;

import java.util.Random;
import java.util.concurrent.Callable;

public class Hippodrome implements Callable<String> {
    private final Random random = new Random();

    @Override
    public String call() throws Exception {
        final String name = Thread.currentThread().getName();
        final int sleep = random.nextInt(400, 500);
        try {
            for (int i = 0; i < 300; i += random.nextInt(100, 250)) {
                Thread.sleep(sleep);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        return name;
    }
}
