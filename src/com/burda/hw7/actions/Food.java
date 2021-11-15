package com.burda.hw7.actions;

import com.burda.hw7.model.Animal;

public class Food {
    public void doAction(Animal animal) {
        if (animal.getHungry() < 50) {
            animal.addHungry(5.0);
            animal.addClear(-2.0d * 1.5d);
        } else if (animal.getHappy() < 20) {
            animal.addHungry(5.0);
            animal.addClear(-2.0d * 1.2d);
        } else if (animal.isSick()) {
            animal.addHungry(5.0);
            animal.addClear(-2.0d * 2.0d);
        } else {
            animal.addHungry(5.0);
            animal.addClear(-2.0d);
        }
    }
}
