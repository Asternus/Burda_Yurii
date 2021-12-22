package com.burda.hw17;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new LinkedList<>();

        Collections.addAll(numbers, random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt());
        IntSummaryStatistics stats = numbers.stream()
                .filter(p -> p >= 0).mapToInt(Integer::intValue).summaryStatistics();
        System.out.format("  count: %d%n", stats.getCount());
        System.out.format("    sum: %d%n", stats.getSum());
        System.out.format("average: %.1f%n", stats.getAverage());
        System.out.format("    min: %d%n", stats.getMin());
        System.out.format("    max: %d%n", stats.getMax());
    }
}