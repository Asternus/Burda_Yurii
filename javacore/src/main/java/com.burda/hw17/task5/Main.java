package com.burda.hw17.task5;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    protected static Random random = new Random();

    public static void main(String[] args) {
        System.out.println(box());
        List<Item> sortedList = box().stream()
                .filter(box -> box.getItems().size() <= limit())
                .flatMap(box -> box.getItems().stream())
                .sorted(Comparator.comparing(Item::getCost))
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }

    public static List<Item> list() {
        List<Item> item = new LinkedList<>();
        for (int i = 0; i < random.nextInt(6); i++) {
            item.add(new Item("name" + random.nextInt(65), random.nextDouble(100.0d)));
        }
        return item;
    }

    public static List<Box> box() {
        List<Box> box = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            box.add(new Box(random.nextInt(200), list()));
        }
        return box;
    }

    private static int limit() {
        return random.nextInt(120);
    }
}