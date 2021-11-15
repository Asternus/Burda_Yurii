package com.burda.hw7.actions;

import com.burda.hw7.model.Animal;

import java.util.Random;

public class Play {
    private final Random random = new Random();
    private int playCount;

    public void doAction(Animal animal) {
        if (animal.getHungry() < 50) {
            animal.addHungry(-3.0d * 1.5d);
            animal.addHappy(6);
            animal.addMoney(random.nextInt(10) + 1);
        } else if (animal.getHappy() < 20) {
            animal.addHungry(-3.0d * 1.2d);
            animal.addHappy(6);
            animal.addMoney(random.nextInt(10) + 1);
        } else if (animal.isSick()) {
            animal.addHungry(-3.0d * 2.0d);
            animal.addHappy(6);
            animal.addMoney(random.nextInt(10) + 1);
        } else {
            animal.addHungry(-3.0);
            animal.addHappy(6);
            animal.addMoney(random.nextInt(10) + 1);
        }
        if (++playCount == 5) {
            playCount = 0;
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
