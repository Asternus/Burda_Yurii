package com.burda.hw7.actions;

import com.burda.hw7.model.Animal;

import java.util.Random;

public class Work {
    private final Random random = new Random();
    private int workCount;

    public void doAction(Animal animal) {
        if (animal.getAge() < 5 || animal.getHappy() < 20) {
            System.out.println("Error!");
            return;
        }

        if (animal.getHungry() < 50) {
            animal.addMoney(random.nextInt(20 - 5) + 5);
            animal.addHungry(-4.0 * 1.5d);
            animal.addHappy(-4.0 * 1.5d);
        } else if (animal.isSick()) {
            animal.addMoney(random.nextInt(20 - 5) + 5);
            animal.addHungry(-4.0d * 2.0d);
            animal.addHappy(-4.0d * 2.0d);
        } else {
            animal.addMoney(random.nextInt(20 - 5) + 5);
            animal.addHungry(-4.0d);
            animal.addHappy(-4.0d);
        }
        if (++workCount == 6) {
            workCount = 0;
            animal.addAge(1);
        }
        final int randomNumber = random.nextInt(100);
        if (animal.getClear() < 50) {
            if (randomNumber <= 30) {
                animal.setSick(true);
            }
        } else {
            if (randomNumber <= 10) {
                animal.setSick(true);
            }
        }
    }
}
