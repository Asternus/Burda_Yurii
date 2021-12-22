package com.burda.hw17.task5;

public class Item {
    private String name;
    private double cost;

    public double getCost() {
        return cost;
    }

    public Item(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}