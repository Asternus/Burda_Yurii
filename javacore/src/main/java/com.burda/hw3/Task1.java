package com.burda.hw3;

public class Task1 {
    public static void main(String[] args) {
        int happy = 0;
        int i = 0;
        while (i <= 999) {
            i++;
            int number1 = i % 10;
            int number2 = (i / 10) % 10;
            int number3 = (i / 100) % 10;
            int sum1 = (number1 + number2 + number3);
            int j = 0;
            while (j <= 999) {
                j++;
                int number4 = j % 10;
                int number5 = (j / 10) % 10;
                int number6 = (j / 100) % 10;
                int sum2 = (number4 + number5 + number6);
                if (sum1 == sum2) {
                    happy++;
                }
            }
        }
        System.out.println("Всего счастливых билетов : " + happy);
    }
}
