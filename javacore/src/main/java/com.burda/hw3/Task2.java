package com.burda.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        char temp;
        do {
            System.out.println("Введите дейсвие: (* умножение, / - деление, - вычитание, + сложение) или введите 0 чтобы закончить вычесления");
            Scanner scan = new Scanner(System.in);
            char symbol = scan.next().charAt(0);
            temp = symbol;
            if (symbol != '0') {
                System.out.println("Введите первое число");
                double nu1 = scan.nextDouble();
                System.out.println("Введите второе число");
                double nu2 = scan.nextDouble();
                switch (symbol) {
                    case ('+'):
                        System.out.println(nu1 + nu2);
                        break;
                    case ('*'):
                        System.out.println(nu1 * nu2);
                        break;
                    case ('/'):
                        if (nu2 != 0) {
                            System.out.println(nu1 / nu2);
                        } else {
                            System.out.println("На ноль делить нельзя");
                        }
                        break;
                    case ('-'):
                        System.out.println(nu1 - nu2);
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
