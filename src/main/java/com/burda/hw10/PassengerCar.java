package com.burda.hw10;

import java.util.Arrays;

public class PassengerCar extends Car {
    private String[] passengers = new String[3];

    public PassengerCar(Series series, String year, Colour color, double fuel) {
        super(series, year, color, fuel);
    }

    @Override
    public void getStatistics() {

    }

    public void addPassenger(Passenger passenger) {
        for (int i = 0; i < 3; i++) {
            passengers[i] = passenger.getPassenger();
            System.out.println(passengers[i]);
        }
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "passengers=" + Arrays.toString(passengers) +
                '}';
    }

    @Override
    public void refuel() {
        this.fuel = 100;
    }
}
