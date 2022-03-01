package com.burda.hw10;

import java.util.Arrays;
import java.util.Random;

public class Truck extends Car {
    private Random random = new Random();
    private String cargo = "Cargo ";
    private String[] cargos = new String[4];

    public Truck(Series series, String year, Colour color, double fuel) {
        super(series, year, color, fuel);
    }

    @Override
    public void getStatistics() {

    }

    @Override
    public boolean getTraffic() {
        this.fuel = fuel - expenditure * 2;
        if (fuel <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public void addCargo() {

        for (int i = 0; i < cargos.length; i++) {
            cargos[i] = cargo + String.valueOf(random.nextInt(300));
            System.out.println(cargos[i]);
        }
    }

    public void dischargeCargo() {
        for (int i = 0; i < cargos.length; i++) {
            cargos[i] = null;
            System.out.println(cargos[i]);
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "fuel=" + fuel +
                '}';
    }

    @Override
    public void refuel() {
        this.fuel = 100;
    }
}



