package com.burda.hw25.hw32.model;

import java.util.concurrent.Callable;
import java.util.concurrent.Semaphore;

public class MultithreadedIncrement implements Callable<Integer> {
    CommonResource res;
    Semaphore sem;
    private Integer variable;

    public MultithreadedIncrement(CommonResource res, Semaphore sem, Integer variable) {
        this.res = res;
        this.sem = sem;
        this.variable = variable;
    }

    @Override
    public Integer call() throws Exception {
        try {
            sem.acquire();
            res.x = 1;
            variable += 2;
            res.x++;
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        } finally {
            sem.release();
        }
        return variable;
    }
}
