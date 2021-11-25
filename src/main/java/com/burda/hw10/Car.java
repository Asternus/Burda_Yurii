package com.burda.hw10;

import lombok.Getter;

@Getter
public abstract class Car implements Recovery {
    private Series series;
    private String year;
    private Colour colour;
    public double fuel;
    public double expenditure = 5.0d;

    public Car(Series series, String year, Colour color, double fuel) {
        this.series = series;
        this.year = year;
        this.colour = color;
        this.fuel = fuel;
    }

    public boolean getTraffic() {
        this.fuel = fuel - expenditure;
        if (fuel <= 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", year='" + year + '\'' +
                ", colour=" + colour +
                ", fuel=" + fuel +
                ", expenditure=" + expenditure +
                '}';
    }

    public abstract void getStatistics();
}
