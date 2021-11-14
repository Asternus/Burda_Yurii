package com.burda.hw7.actions;

import com.burda.hw7.model.Animal;
import java.util.Random;

public class Work {
    private final Random random = new Random();
    private int workCount;

    public void doAction (Animal animal) {
        if (animal.getAge() < 5) {
            System.out.println("Error");
            return;
        }
        animal.addMoney(random.nextInt(20 - 5) + 5);
        animal.addHungry(-4.0d);
        animal.addHappy(-2.0d);

        if (++workCount == 6) {
            workCount = 0;
            animal.addAge(1);
        }
        final int randomNumber = random.nextInt(100);
    }
}
