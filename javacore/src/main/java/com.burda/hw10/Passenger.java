package com.burda.hw10;

import lombok.Getter;

import java.util.Random;


public class Passenger {
    private String passenger;
    private Random random = new Random();

    public String getPassenger() {

        return passenger = "Passenger " + random.nextInt(300);
    }
}
