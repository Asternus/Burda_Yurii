package com.burda.hw11;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class RotaryPhone extends Phone {
    public RotaryPhone(Variety variety, Years years) {
        super(variety, years);
    }

    @Override
    String call() {
        System.out.println("Наберите номер");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        return a;
    }

    @Override
    String sms() {
        return "no sms";
    }

    public void play() {
        System.out.println("Игать в диск");
    }

    @Override
    public void menu() {
        System.out.println("Цыфры от 0 до 9");
    }

    @Override
    public void app() {
    }
}
