package com.burda.practica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(div1());
        div2();
        div3();
        div4();
    }

    public static int div1() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 10;
        return (a != 0) ? b / a : -1;
    }

    public static void div2() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 10;
        boolean success = (a != 0);
        if (success) {
            System.out.println(b / a);
        } else {
            System.out.println(-1);
        }
    }

    public static void div3() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 10;
        if (a == 0) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            System.out.println(b / a);
        }
    }

    public static void div4() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 10;
        if (a == 0) {
            System.exit(-1);
        } else {
            System.out.println(b / a);
        }
    }
}
