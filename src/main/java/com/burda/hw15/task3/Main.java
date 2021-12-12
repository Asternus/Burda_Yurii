package com.burda.hw15.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    final static List<String> animal = new ArrayList<String>();

    public Main() {
    }

    public static void main(String[] args) {
        animal.add("Dog");
        animal.add("Racoon");
        animal.add("Puppy");
        animal.add("Bear");
        animal.add("Elephant");

        System.out.println(getAnimal(animal));
    }

    public static int getSize(List<String> newAnimal, int a) {
        int key = newAnimal.get(a).length();
        return key;
    }

    public static Map getAnimal(List<String> newAnimal) {
        Map<Integer, String> hashAnimal = new HashMap<>();
        for (int i = 0; i < newAnimal.size(); i++) {
            int key = getSize(newAnimal, i);
            hashAnimal.put(key, String.valueOf(newAnimal.get(i)));
        }
        return hashAnimal;
    }
}
