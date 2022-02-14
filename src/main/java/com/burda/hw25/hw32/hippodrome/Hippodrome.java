package com.burda.hw25.hw32.hippodrome;

import java.time.LocalTime;
import java.util.Random;

public class Hippodrome extends Thread {

    private final Random random = new Random();

    @Override
    public void run() {
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
        System.out.println(LocalTime.now() + "::" + name + " finished");
    }
}
