package com.burda.hw7.actions;

import com.burda.hw7.model.Animal;

import java.util.Random;

public class Play {
    private final Random random = new Random();
    private int playCount;

    public void doAction(Animal animal) {

        if (animal.getHungry() < 50) {
            animal.setUnHungry(true);
        }
        if (animal.getHungry() > 50) {
            animal.setUnHungry(false);
        }
        if (animal.getHappy() < 20) {
            animal.setUnHappy(true);
        }
        if (animal.getHappy() > 20) {
            animal.setUnHappy(false);
        }

        animal.addHappy(6);
        animal.addMoney(random.nextInt(10) + 1);

        if ((animal.isUnHungry()) && (!animal.isUnHappy()) && (!animal.isSick())) {
            animal.addHungry(-3.0d * 1.5d);
        }
        if ((animal.isUnHappy()) && (!animal.isUnHungry()) && (!animal.isSick())) {
            animal.addHungry(-3.0d * 1.2d);
        }
        if ((animal.isSick()) && (!animal.isUnHappy()) && (!animal.isUnHungry())) {
            animal.addHungry(-3.0d * 2.0d);
        }
        if ((animal.isSick()) && (animal.isUnHappy()) && (animal.isUnHungry())) {
            animal.addHungry(-3.0d * 2.0d * 1.2d * 1.5d);
        }
        if ((animal.isSick()) && (!animal.isUnHappy()) && (animal.isUnHungry())) {
            animal.addHungry(-3.0d * 2.0d * 1.5d);
        }
        if ((animal.isSick()) && (animal.isUnHappy()) && (!animal.isUnHungry())) {
            animal.addHungry(-3.0d * 2.0d * 1.2);
        }
        if ((!animal.isSick()) && (animal.isUnHappy()) && (animal.isUnHungry())) {
            animal.addHungry(-3.0d * 1.5d * 1.2);
        } else {
            animal.addHungry(-3.0);
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
