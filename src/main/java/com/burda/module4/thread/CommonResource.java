package com.burda.module4.thread;

import lombok.Getter;

@Getter
public class CommonResource {
    private int x = 50;

    public void setX(int x) {
        this.x += x;
    }
}
