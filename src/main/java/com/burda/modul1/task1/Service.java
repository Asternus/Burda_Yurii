package com.burda.modul1.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Service {
    static Scanner scan = new Scanner(System.in);
    static int input = scan.nextInt();

    public static int getInput() {
        return input;
    }

    public static void sortArray(MyArray myArray) {
        String tem2;
        do {
            System.out.println("Выберите способ сортировки: введите 1 - от меньшего к большему, введите 2 - от большего к меньшему");
            Scanner scan = new Scanner(System.in);
            String change = scan.nextLine();
            tem2 = change;
            switch (change) {
                case ("1"):
                    myArray.bubbleSortMin(myArray.getArr());
                    System.out.println(Arrays.toString(myArray.getArr()));
                    break;
                case ("2"):
                    myArray.bubbleSortMax(myArray.getArr());
                    System.out.println(Arrays.toString(myArray.getArr()));
                    break;
                default:
                    System.out.println("Вы ввели ошибочный символ");
            }
        } while ((!"1".equals(tem2)) && (!"2".equals(tem2)));
    }

    public static void service(MyArray myArray) {
        int temp;
        do {
            temp = input;
            if (input >= 10) {
                System.out.println(Arrays.toString(myArray.getArr()));
                sortArray(myArray);
                myArray.cube();
            } else {
                System.out.println("Error, try again");
            }
        } while (temp < 10);
    }
}
