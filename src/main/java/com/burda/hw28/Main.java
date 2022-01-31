package com.burda.hw28;

public class Main {
    public static void main(String[] args) {
        double a = 10.0d;
        double sinA = Math.sin(a);
        double cosA = Math.cos(a);
        double sum = Math.pow(sinA, 2.0d) + Math.pow(cosA, 2.0d);
        System.out.println(sum);
        if (sum == 1.0d) {
            System.out.println("Pythagorean trigonometric identity");
        } else {
            System.out.println("Error");
        }
    }
}
