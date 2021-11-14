package com.burda.modul1.task2;

public class Lock {

    int[] array;

    public int[] getArray() {
        return array == null ? null : array.clone();
    }

    public Lock(int[] array) {
        this.array = array.clone();
    }
}
