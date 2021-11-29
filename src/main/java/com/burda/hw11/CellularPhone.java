package com.burda.hw11;

import java.util.Random;
import java.util.Scanner;

public class CellularPhone extends Phone {
    protected Scanner scanner = new Scanner(System.in);

    public CellularPhone(Variety variety, Years years) {
        super(variety, years);
    }

    @Override
    String call() {
        System.out.println("Наберите номер для звонка");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        return a;
    }

    @Override
    public String sms() {
        return null;
    }

    @Override
    public void menu() {
        System.out.println("Выберите пункт меню 1 - смс, 2 - звонок");
        int b = scanner.nextInt();
        switch (b) {
            case (1):
                call();
                break;
            case (2):
                System.out.println(sms());
                break;
            default:
                System.out.println("Вы ввели ошибочный символ");
        }
    }

    public void calculator() {
        int a = 2;
        int b = 3;
        System.out.println(a + b);
    }

    @Override
    public void app() {
        System.out.println("Игарть в змейку");
    }
}
