package com.burda.hw17;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new LinkedList<>();
        Collections.addAll(numbers, random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt());
        System.out.println(numbers);
        System.out.format("min: %d%n", numbers.stream().mapToInt(Integer::intValue)
                .reduce(Integer::min).orElse(0));
    }
}