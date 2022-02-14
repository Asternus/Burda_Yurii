package com.burda.hw25.hw32.hippodromeconcurrent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количесво лошадей");
        int maxHorse = scanner.nextInt();
        System.out.println("Введите номер лошади на которую Вы ставите");
        int bid = scanner.nextInt();

        ExecutorService executor = Executors.newFixedThreadPool(maxHorse);
        List<Future<String>> list = new ArrayList<>();
        for (int i = 0; i < maxHorse; i++) {
            Callable<String> callable = new Hippodrome();
            Future<String> future = executor.submit(callable);
            list.add(future);
        }
        for (Future<String> fut : list) {
            try {
                System.out.println(new Date() + "::" + fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
    }
}

