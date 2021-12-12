package com.burda.hw15.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void getTreeSet() {
        String actual = Main.getTreeSet().toString();
        String expected = "[Box(value=0), Box(value=88), Box(value=77), Box(value=22), Box(value=11)]";
        assertEquals(expected, actual);
    }
}