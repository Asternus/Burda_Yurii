package com.burda.modul2.model;

import lombok.Data;

@Data
public class Television {
    String series;
    String diagonal;
    String screenType;
    String country;
    int price;

    public Television(String series, String diagonal, String screenType, String country, int price) {
        this.series = series;
        this.diagonal = diagonal;
        this.screenType = screenType;
        this.country = country;
        this.price = price;
    }
}