package com.burda.hw15.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    final static List<String> animal = new ArrayList<String>();

    public static void main(String[] args) {
        animal.add("Dog");
        animal.add("Racoon");
        animal.add("Puppy");
        animal.add("Bear");
        animal.add("Elephant");

        System.out.println(addAnimal(animal));
    }

    public static Map<Integer, String> addAnimal(List<String> newAnimal) {
        Map<Integer, String> hashAnimal = new HashMap<>();
        for (String animal : newAnimal) {
            hashAnimal.put(animal.length(), animal);
        }
        return hashAnimal;
    }
}
