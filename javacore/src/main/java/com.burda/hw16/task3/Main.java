package com.burda.hw16.task3;

public class Main {
    public static void main(String[] args) {

        String[] test1 = new String[]{"Cat", "Dog", "Frog"};
        ArrayIterator<String> test = new ArrayIterator<>(test1);
        while (test.hasNext()) {
            System.out.println(test.next());
        }
    }
}
