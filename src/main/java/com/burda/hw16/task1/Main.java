package com.burda.hw16.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    final public static Random random = new Random();
    final public static List<Double> arrayList = new ArrayList<>();
    final public static List<Double> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        compare2Lists();
        currentTime(arrayList, linkedList);
    }

    public static void compare2Lists() {
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(random.nextDouble());
            linkedList.add(random.nextDouble());
        }
    }

    public static void currentTime(List<Double> arrayList, List<Double> linkedList) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.get((int) random.nextDouble(1000000));
        }
        System.out.println("arrayList: ");
        System.out.println(System.currentTimeMillis() - startTime);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.get((int) random.nextDouble(1000000));
        }
        System.out.println("linkedList: ");
        System.out.println(System.currentTimeMillis() - startTime);
    }
}

