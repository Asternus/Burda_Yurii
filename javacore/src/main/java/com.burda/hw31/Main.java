package com.burda.hw31;

import com.burda.hw31.thread.MyThread;
import com.burda.hw31.util.UtilList;
import com.burda.hw31.util.Util;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            integerList.add(i);
        }

        Util util = new Util();
        util.createTreadAndQueueStart();
        UtilList utilList = new UtilList();

        MyThread myThread1 = new MyThread(utilList.getListOfFirstPart(integerList));
        MyThread myThread2 = new MyThread(utilList.getListOfSecondPart(integerList));

        try {
            myThread1.start();
            myThread2.start();
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Count : " + (myThread1.getCount() + myThread2.getCount()));
    }
}

