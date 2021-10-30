package com.burda.hw2;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        findArea();
        System.out.println();
        createNum();
        System.out.println();
        findEven();
        System.out.println();
        transBinary();
    }

    public static void findArea() {
        double a = 15.0;
        double b = 25.0;
        double c = 14.0;
        double p = (a + b + c) / 2.0;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника равна: " + s);
    }

    public static void createNum() {
        int rn1, rn2, rn3;
        Random x = new Random();
        rn1 = x.nextInt();
        rn2 = x.nextInt();
        rn3 = x.nextInt();
        int fewer = (Math.abs(rn1) < Math.abs(rn2) && Math.abs(rn1) < Math.abs(rn3)) ? rn1 : (Math.abs(rn2) < Math.abs(rn1) && Math.abs(rn2) < Math.abs(rn3)) ? rn2 : rn3;
        System.out.println("|Меньшее число| = " + fewer);
    }

    public static void findEven() {
        Random y = new Random();
        int even = (y.nextInt()) % 2;
        if (even == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }
    }

    public static void transBinary() {

        System.out.println("Введите число для перевода в двоичную систему");
        Scanner first = new Scanner(System.in);
        int num = first.nextInt();
        if (num > 0) {
            int b;
            String temp = "";
            while (num != 0) {
                b = num % 2;
                num /= 2;
                temp += b;
            }
            StringBuilder sb = new StringBuilder(temp);
            sb.reverse();
            System.out.print(sb);
        } else {
            System.out.println("Вы ввели отрицательное число или 0");
        }
    }
}
