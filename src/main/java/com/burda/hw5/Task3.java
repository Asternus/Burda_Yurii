package com.burda.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[4];
        int[] array2 = new int[4];
        Random random = new Random();
        double sum = 0;
        double sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
            array2[i] = random.nextInt(5);
            sum = sum + array[i];
            sum2 = sum2 + array2[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        double result1 = sum / array.length;
        System.out.println("Среднее арифметическое первого массива: " + result1);
        double result2 = sum2 / array.length;
        System.out.println("Среднее арифметическое второго массива: " + result2);
        if (result1 > result2) {
            System.out.println("Сумма значений первого массива  больше второго");
        } else if (result1 == result2) {
            System.out.println("Сумма значений массивов равна");
        } else {
            System.out.println("Сумма значений второго массива больше первого");
        }
    }
}
