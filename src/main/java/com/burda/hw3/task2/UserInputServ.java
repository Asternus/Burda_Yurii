package com.burda.hw3.task2;

import java.util.Scanner;

public class UserInputServ {

    private Scanner scan = new Scanner(System.in);
    private char symbol;
    double nu1;
    double nu2;

    public char getSymbol() {
        symbol = scan.next().charAt(0);
        return symbol;
    }

    public double getNumberFirst() {
        nu1 = scan.nextDouble();
        return nu1;
    }

    public double getNumberSecond() {
        nu2 = scan.nextDouble();
        return nu2;
    }
}
