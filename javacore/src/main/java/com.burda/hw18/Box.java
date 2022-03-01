package com.burda.hw18;

import lombok.Data;


@Data
public class Box {
    private String from;
    private String material;
    private String color;
    private Cargo cargo = new Cargo();
    private MaxLiftingCapacity maxLiftingCapacity = new MaxLiftingCapacity();
    private DateTime dateTime = new DateTime();
}
