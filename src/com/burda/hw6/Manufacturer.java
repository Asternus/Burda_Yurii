package com.burda.hw6;

public enum Manufacturer {
    Mercedes("Мерседес"), Tesla("Тесла");

    private String russianName;

    Manufacturer(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

}

