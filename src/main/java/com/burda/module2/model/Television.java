package com.burda.module2.model;

public class Television extends Sale {
    @Override
    public String toString() {

        return "Television: " +
                " diagonal is " + getDiagonal() + "," +
                " series is " + getSeries() + "," +
                " screen type is " + getScreenType() + "," +
                " country is " + getCountry() + "," +
                " price is " + getPrice();
    }
}
