package com.burda.hw7.actions;

import com.burda.hw7.model.Animal;

import java.util.Random;
import java.util.Scanner;

public class Store {
    public void doAction(Animal animal) {
        Scanner scanner = new Scanner(System.in);
        if (animal.getMoney() >= 100) {
            int temp;
            do {
                System.out.println("Введите номер подарка, \n 1. Стоит 100 монет (+20 счастье) \n 2. Стоит 150 монет (+25 счастье) \n 3. Стоит 200 монет (+30 счастье)");
                int s = scanner.nextInt();
                temp = s;
                Random random = new Random();
                String first = String.valueOf(random.nextInt(300));
                switch (s) {
                    case (1): {
                        animal.addPresents(first);
                        animal.addMoney(-100);
                        animal.addHappy(20.0d);
                        break;
                    }
                    case (2): {
                        animal.addPresents(first);
                        animal.addMoney(-150);
                        animal.addHappy(25.0d);
                        break;
                    }
                    case (3): {
                        animal.addPresents(first);
                        animal.addMoney(-200);
                        animal.addHappy(30.0d);
                        break;
                    }
                }
            } while ((temp != 1) && (temp != 2) && (temp != 3));
        } else {
            System.out.println("Error, у вас мало денег");
        }
    }
}
