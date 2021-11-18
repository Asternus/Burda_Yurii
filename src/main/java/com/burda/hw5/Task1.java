package com.burda.hw5;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {


        int[] array = new int[8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(array));
        for (int j = 0; j < array.length; j++) {
            if (j % 2 != 0) {
                array[j] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
