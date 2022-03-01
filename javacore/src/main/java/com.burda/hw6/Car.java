package com.burda.hw6;

public class Car {
    private Manufacturer manufacturer;
    private Engine powType;
    private String colour;
    private double petrol;

    public Car(Manufacturer manufacturer, Engine powType, String colour) {
        this.manufacturer = manufacturer;
        this.powType = powType;
        this.colour = colour;
        this.petrol = 100;
    }

    public Engine getPowType() {
        return powType;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setPetrol(double petrol) {
        this.petrol = petrol;
    }

    public void startEngine(String name) {
        System.out.println(name + " start engine");
    }

    public boolean isEnoughPetrolLevel() {
        if (petrol > 50) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer.getRussianName() + '\'' +
                ", engine='" + powType + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}


