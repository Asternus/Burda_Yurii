package com.burda.hw31.thread;

import com.burda.hw31.util.Util;

import java.util.List;

public class MyThread extends Thread {
    private final List<Integer> integerList;
    private int count;

    public MyThread(List<Integer> list) {
        integerList = list;
    }

    @Override
    public void run() {
        count = integerList.stream()
                .filter(Util::isPrime).toList().size();
    }

    public int getCount() {
        return count;
    }
}
