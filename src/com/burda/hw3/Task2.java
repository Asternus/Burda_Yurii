package com.burda.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        char temp;
        do {
            System.out.println("Введите дейсвие: (* умножение, / - деление, - вычитание, + сложение) или введите 0 чтобы закончить вычесления");
            Scanner ch = new Scanner(System.in);
            char symbol = ch.next().charAt(0);
            temp = symbol;
            if (symbol != '0') {
                System.out.println("Введите первое число");
                Scanner first = new Scanner(System.in);
                int Nu1 = first.nextInt();
                System.out.println("Введите второе число");
                Scanner second = new Scanner(System.in);
                int Nu2 = second.nextInt();
                switch (symbol) {
                    case ('+'):
                        System.out.println(Nu1 + Nu2);
                        break;
                    case ('*'):
                        System.out.println(Nu1 * Nu2);
                        break;
                    case ('/'):
                        if (Nu2 != 0) {
                            System.out.println(Nu1 / Nu2);
                        } else {
                            System.out.println("На ноль делить нельзя");
                        }
                        break;
                    case ('-'):
                        System.out.println(Nu1 - Nu2);
                        break;
                    default:
                        System.out.println("Вы ввели ошибочный символ");
                }
            } else {
                System.out.println("Расчеты окончены");
            }
        }
        while (temp != '0');
    }
}
