package com.burda.hw17.task5;

import java.util.List;

public class Box {
    private int size;
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public Box(int size, List<Item> items) {
        this.size = size;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                ", items=" + items +
                '}';
    }
}