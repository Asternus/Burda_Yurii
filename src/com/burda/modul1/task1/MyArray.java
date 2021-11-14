package com.burda.modul1.task1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class MyArray {
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();
    int[] arr = arrayIn();

    public int[] getArr() {
        return arr;
    }

    public int getInput() {
        return input;
    }

    private int[] arrayIn() {
        int[] array = new int[input];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(200) - 100);
        }
        return array;
    }

    private void bubbleSortMax(int[] num) {
        int j;
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }

    private void bubbleSortMin(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void sortArray() {
        String tem2;
        do {
            System.out.println("Выберите способ сортировки: введите 1 - от меньшего к большему, введите 2 - от большего к меньшему");
            Scanner scan = new Scanner(System.in);
            String change = scan.nextLine();
            tem2 = change;
            switch (change) {
                case ("1"):
                    bubbleSortMin(arr);
                    System.out.println(Arrays.toString(arr));
                    break;
                case ("2"):
                    bubbleSortMax(arr);
                    System.out.println(Arrays.toString(arr));
                    break;
                default:
                    System.out.println("Вы ввели ошибочный символ");
            }
        } while ((!"1".equals(tem2)) && (!"2".equals(tem2)));
    }

    public void cube() {
        for (int i = 2; i < arr.length; i += 3) {
            arr[i] = (int) Math.pow(arr[i], 3);
        }
        System.out.println("Массив с кубическим значением каждого третьего: " + "\n" + Arrays.toString(arr));
    }
}


