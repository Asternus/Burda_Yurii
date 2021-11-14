package com.burda.hw7.actions;

import com.burda.hw7.model.Animal;

import java.util.Random;

public class Play {
    private final Random random = new Random();
    private int playCount;

    public void doAction(Animal animal) {
        animal.addHungry(-3.0d);
        animal.addHappy(6);
        animal.addMoney(random.nextInt(10) + 1);

        if (++playCount == 5) {
            playCount = 0;
            animal.addAge(1);
        }
        final int randomNumber = random.nextInt(100);
    }
}
