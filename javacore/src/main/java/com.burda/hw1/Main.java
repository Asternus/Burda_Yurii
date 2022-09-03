package com.burda.hw1;

public class Main {
    public static void main(String[] args) {
        setName();
        System.out.println();
        setStep();
    }

    static void setName() {
        String name = "Yurii";
        String surname = "Burda";
        String less = "less than 7";
        String more = "more than 7";
        System.out.println(name + " " + surname);
        System.out.println();
        int quantity = name.length();
        if (quantity > 7) {
            System.out.println(more);
        } else {
            System.out.println(less);
        }
    }

    public static void setStep() {
        String step = "Шаг";
        String meaning = "значение";
        int walk = 0;
        int i = 5;
        while (i <= 25) {
            System.out.println(step + " " + walk + "," + " " + meaning + " " + i);
            walk++;
            i += 2;
        }
    }
}
