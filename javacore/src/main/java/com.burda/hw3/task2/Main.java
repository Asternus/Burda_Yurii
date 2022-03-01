package com.burda.hw3.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInputServ userInputServ = new UserInputServ();
        Calculator calculator = new Calculator();
        System.out.println(calculator.giveRes(userInputServ));
    }
}
