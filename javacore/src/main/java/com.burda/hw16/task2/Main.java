package com.burda.hw16.task2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        buildDictionaryWithMap("Я люблю енотов, коты хорошие, кот это хорошо");
    }

    public static void buildDictionaryWithMap(String text) {
        text = text.toLowerCase();
        text = text.replace("[,.:-?;]", "");
        String[] split = text.split(" ");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (String word : split) {
            Integer oldCount = map.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            map.put(word, oldCount + 1);
        }
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> Integer.compare(o1.getValue(), o2.getValue()));
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}





