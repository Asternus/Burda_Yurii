package com.burda.hw31.util;

public class Util {

    public void createTreadAndQueueStart() {
        for (int i = 50; i >= 0; i--) {
            String name = "Hello from thread № " + i;
            Runnable r0 = () -> System.out.println(name);
            Thread thread1 = new Thread(r0);
            try {
                thread1.start();
                thread1.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        if (number % 2 == 0) {
            return number == 2;
        }
        int limit = (int) (0.1 + Math.sqrt(number));
        for (int i = 3; i <= limit; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
