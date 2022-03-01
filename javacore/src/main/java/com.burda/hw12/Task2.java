package com.burda.hw12;

public class Task2 {
    public static void f() {
        g();
    }

    public static void g() {
        throw new IllegalArgumentException("Exception is 1");
    }
}
