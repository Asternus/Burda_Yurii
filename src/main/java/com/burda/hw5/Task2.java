package com.burda.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();
        int max = 99;
        int min = 10;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min) + min;
        }
        System.out.println(Arrays.toString(array));

        int i = 0;
        while (i < array.length) {
            i++;
            if (i > 0 && array[i - 1] >= array[i]) {
                System.out.println("Массив не являетсся строго возрастающей последовательностью");
                break;
            }
        }
    }
}


