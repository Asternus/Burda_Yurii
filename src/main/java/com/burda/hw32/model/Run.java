package com.burda.hw32.model;

import java.util.concurrent.Semaphore;

public class Run implements Runnable {
    Semaphore sem;
    CommonResource res;

    public Run(Semaphore sem, CommonResource res) {
        this.sem = sem;
        this.res = res;
    }

    @Override
    public void run() {
        try {
            sem.acquire();
            res.x += 2;
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            sem.release();
        }
    }
}
