package com.burda.hw3.task1;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner = new Scanner(System.in);
    private int number = scanner.nextInt();

    public int getNumber() {
        return number;
    }
}
