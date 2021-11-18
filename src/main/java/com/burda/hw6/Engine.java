package com.burda.hw6;

public class Engine {

    private double power;
    private String type;

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", type='" + type + '\'' +
                '}';
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setType(String type) {
        this.type = type;
    }

}


