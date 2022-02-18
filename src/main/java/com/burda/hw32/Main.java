package com.burda.hw32;

import com.burda.hw32.model.CommonResource;
import com.burda.hw32.model.Run;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        Semaphore semaphore = new Semaphore(1);
        final ExecutorService pool = Executors.newFixedThreadPool(100);
        Run run = new Run(semaphore, commonResource);

        for (int i = 0; i < 100; i++) {
            pool.submit(run);
        }

        try {
            final boolean done = pool.awaitTermination(11, TimeUnit.SECONDS);
            System.out.println("pool done " + done);
        } catch (Exception c) {
            System.out.println(c.getMessage());
        } finally {
            pool.shutdown();
        }
        System.out.println("Variable " + commonResource.getX());
    }
}
