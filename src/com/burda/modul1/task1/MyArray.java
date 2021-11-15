package com.burda.modul1.task1;

import java.util.Arrays;
import java.util.Random;

public class MyArray {

    int[] arr = arrayIn();

    public int[] getArr() {
        return arr;
    }


    private int[] arrayIn() {
        System.out.println("Введите число >= 10");
        int[] array = new int[Service.getInput()];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (random.nextInt(200) - 100);
        }
        return array;
    }

    public void bubbleSortMax(int[] num) {
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

    public void bubbleSortMin(int[] arr) {
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

    public void cube() {
        for (int i = 2; i < arr.length; i += 3) {
            arr[i] = (int) Math.pow(arr[i], 3);
        }
        System.out.println("Массив с кубическим значением каждого третьего: " + "\n" + Arrays.toString(arr));
    }
}


