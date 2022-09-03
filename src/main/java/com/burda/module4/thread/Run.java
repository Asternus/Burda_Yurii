package com.burda.module4.thread;

import java.util.concurrent.Semaphore;

public class Run implements Runnable {
    private Semaphore sem;
    private CommonResource res;

    public Run(Semaphore sem, CommonResource res) {
        this.sem = sem;
        this.res = res;
    }

    @Override
    public void run() {
        try {
            sem.acquire();
            res.setX(2);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            sem.release();
        }
    }
}
