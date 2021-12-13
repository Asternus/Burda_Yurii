package com.burda.hw15.task3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void addAnimal() {
        List<String> testAnimal = new ArrayList<>();
        Map<Integer, String> testMap = new HashMap<>();
        testAnimal.add("Dog");
        testMap.put(3, "Dog");
        Map<Integer, String> actual = Main.addAnimal(testAnimal);
        assertEquals(testMap, actual);
    }
}