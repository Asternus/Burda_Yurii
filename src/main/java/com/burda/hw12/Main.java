package com.burda.hw12;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Task1.doException();
        } catch (IllegalArgumentException e) {
            System.out.println("Error = " + e.getMessage());
        } finally {
            System.out.println("Test");
        }
        try {
            UserExceptionMethod userExceptionMethod = new UserExceptionMethod();
            userExceptionMethod.userMethod();
        } catch (UserInputException | UserIllegalException | UserArgumentException e) {
            System.out.println("User Error = " + e.getMessage());
        }
        try {
            Task2.f();
        } catch (IllegalArgumentException e) {
            throw new IOException();
        }
    }
}
