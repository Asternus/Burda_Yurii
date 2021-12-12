package com.burda.hw15.task1;

import com.burda.hw15.task2.Main;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyListTest {

    MyList<Integer> myList = new MyList<>();

    @Test
    public void add() {
        myList.add(10);
        myList.add(12);
        myList.add(24);
        myList.add(41);
        String actual = myList.toString();
        String expected = "MyList{head=MyNode{value=10}, tail=MyNode{value=41}}";
        assertEquals(expected, actual);
    }

    @Test
    public void getFromLast() {
        myList.add(10);
        myList.add(12);
        myList.add(24);
        myList.add(41);
        int actual = myList.getFromLast(41);
        int expected = 3;
        assertEquals(expected, actual);
    }
}