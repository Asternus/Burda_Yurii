package com.burda.hw32.hippodromeconcurrent;

import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количесво лошадей");
        int maxHorse = scanner.nextInt();
        System.out.println("Введите номер лошади на которую Вы ставите");
        int bind = scanner.nextInt();
        ExecutorService executor = Executors.newFixedThreadPool(maxHorse);
        List<Callable<String>> list = new ArrayList<>();

        for (int i = 0; i < maxHorse; i++) {
            Callable<String> callable = new Hippodrome();
            list.add(callable);
        }

        try {
            String result = executor.invokeAny(list);
            System.out.println(result);
            if (result.equals(("pool-1-thread-") + bind)) {
                System.out.println("You WIN");
            } else {
                System.out.println("You lose");
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}