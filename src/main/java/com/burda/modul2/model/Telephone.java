package com.burda.modul2.model;

import lombok.Data;

@Data
public class Telephone {
    String series;
    String model;
    String screenType;
    int price;

    public Telephone(String series, String model, String screenType, int price) {
        this.series = series;
        this.model = model;
        this.screenType = screenType;
        this.price = price;
    }
}
