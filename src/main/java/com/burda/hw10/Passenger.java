package com.burda.hw10;

import lombok.Getter;

import java.util.Random;


public class Passenger {
    Random random = new Random();
    private String passenger;

    public String getPassenger() {
        return passenger = "Passenger " + String.valueOf(random.nextInt(300));
    }
}
