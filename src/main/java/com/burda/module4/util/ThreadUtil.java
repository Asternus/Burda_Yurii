package com.burda.module4.util;


import com.burda.module4.thread.CommonResource;
import com.burda.module4.thread.MyRunnable;
import com.burda.module4.thread.Run;
import com.burda.module4.thread.TestJoin;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class ThreadUtil {

    public void semaphore() {
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

    public void runnable() {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        try {
            Thread.sleep(10L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myRunnable.doStop();
    }

    public void testJoin() {
        TestJoin t1 = new TestJoin();
        TestJoin t2 = new TestJoin();
        TestJoin t3 = new TestJoin();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }

}
