package com.burda.hw15.task3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    final private List<String> testAnimal = new ArrayList<String>();

    @Test
    public void getSize() {
        testAnimal.add("Dog");
        int actual = Main.getSize(testAnimal, 0);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void getAnimal() {
        testAnimal.add("Dog");
        String actual = Main.getAnimal(testAnimal).toString();
        String expected = "{3=Dog}";
        assertEquals(expected, actual);
    }
}