package com.burda.hw15.task2;

import lombok.Value;

import java.util.Comparator;

@Value
public class Box implements Comparator<Box> {
    private Integer value;

    @Override
    public int compare(Box o1, Box o2) {
        return 0;
    }
}
