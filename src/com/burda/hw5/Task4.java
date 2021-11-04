package com.burda.hw5;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int temp;
        int n = 0, c = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите целове число больше 3");
            int input = scan.nextInt();
            temp = input;
            if (input >= 3) {
                Random random = new Random();
                int[] array = new int[input];
                int even = 0;
                for (int i = 0; i < array.length; i++) {
                    array[i] = random.nextInt(input);
                    if (array[i] % 2 == 0) {
                        even++;
                    }
                }
                System.out.println(Arrays.toString(array));

                int[] array2 = new int[even];
                int index = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] % 2 == 0) {
                        array2[index] = array[i];
                        index++;
                    }
                }

                System.out.println(Arrays.toString(array2));
            }
        }
        while (temp < 3);
    }
}
