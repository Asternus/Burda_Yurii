package com.burda.hw11;

import java.util.Scanner;

public class Smartphone extends Phone {
    protected Scanner scanner = new Scanner(System.in);

    public Smartphone(Colour colour, Years years) {
        super(colour, years);
    }

    @Override
    public String call() {
        System.out.println("Нажмите 1 для видеосвязи и 2 для голосового вызова");
        int b = scanner.nextInt();
        String a = "аудиосвязь" + inquiry();
        String c = "видеосвязь" + inquiry();
        return b == 1 ? a : c;
    }

     public String sms() {
        String a = inquiry();
        System.out.println("Введите ваше сообщение");
        String d = scanner.nextLine() + a;
        return d;
    }

    public String inquiry() {
        System.out.println("Введите номер абонента или ваш забпрос");
        String a = scanner.nextLine();
        return a;
    }

    public void serfInternet() {
        String a = inquiry();
        System.out.println("Запросы по тегу: " + a);
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
            case (3):
                serfInternet();
                break;
            default:
                System.out.println("Вы ввели ошибочный символ");
        }
    }

    @Override
    public void app() {
        System.out.println("Шторка приложений");
    }
}

