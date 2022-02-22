package com.burda.hw32.model;

import lombok.Getter;

@Getter
public class CommonResource {
    private int x = 50;

    public void setX(int x) {
        this.x += x;
    }
}
