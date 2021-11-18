package com.burda.hw5;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int temp;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите целове число больше 3");
            int input = scan.nextInt();
            temp = input;
            if (input >= 3) {
                Random random = new Random();
                int[] array = new int[input];
                int even = 0;
                int i = 0;
                while (i < array.length) {
                    array[i] = random.nextInt(input);
                    if (array[i] % 2 == 0) {
                        even++;
                    }
                    i++;
                }
                System.out.println(Arrays.toString(array));
                int[] array2 = new int[even];
                int j = 0;
                int index = 0;
                while (j < array.length) {
                    if (array[j] % 2 == 0) {
                        array2[index] = array[j];
                        index++;
                    }
                    j++;
                }
                System.out.println(Arrays.toString(array2));
            } else {
                System.out.println("Ошибка, выполните повторный ввод: ");
            }
        }
        while (temp < 3);
    }
}
