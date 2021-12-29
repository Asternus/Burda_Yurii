package com.burda.modul2.model;

public class Telephone extends Sale {
    @Override
    public String toString() {
        return "Telephone: " +
                "model is " + getModel() + "," +
                " series is " + getSeries() + "," +
                " screen type is " + getScreenType() + "," +
                " price is " + getPrice();
    }
}