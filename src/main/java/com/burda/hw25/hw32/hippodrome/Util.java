package com.burda.hw25.hw32.hippodrome;

import java.util.Scanner;

public class Util {

    private final Scanner scanner = new Scanner(System.in);
    private int maxHorse;
    private int bid;

    public void userInput() {
        System.out.println("Введите количесво лошадей");
        maxHorse = scanner.nextInt();
        System.out.println("Введите номер лошади на которую Вы ставите");
        bid = scanner.nextInt();
    }

    public void start() {
        for (int i = 1; i <= maxHorse; i++) {
            String name = "Horse " + i;
            Hippodrome hippodrome1 = new Hippodrome();
            hippodrome1.setName(name);
            hippodrome1.start();
        }
    }
}
