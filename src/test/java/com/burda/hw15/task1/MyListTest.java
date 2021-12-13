package com.burda.hw15.task1;

import com.burda.hw14.task1.MyList;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyListTest {

    final private MyList<Integer> myList = new MyList<>();

    @Test
    public void add() {
        myList.add(10);
        myList.add(12);
        myList.add(24);
        myList.add(41);
        int actual = myList.getSize();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void getLastFromLast() {
        myList.add(10);
        myList.add(12);
        myList.add(24);
        myList.add(41);
        int actual = myList.getFromLast(41);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void getFirstFromLast() {
        myList.add(10);
        myList.add(12);
        myList.add(24);
        myList.add(41);
        int actual = myList.getFromLast(10);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void getNullFromLast() {
        myList.add(10);
        myList.add(12);
        myList.add(24);
        myList.add(41);
        Integer actual = myList.getFromLast(18);
        Integer expected = null;
        assertEquals(expected, actual);
    }
}