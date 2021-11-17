package com.burda.hw7.actions;

import com.burda.hw7.model.Animal;

public class Food {
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

        animal.addHungry(5.0);

        if ((animal.isUnHungry()) && (!animal.isUnHappy()) && (!animal.isSick())) {
            animal.addClear(-2.0d * 1.5d);
        }
        if ((animal.isUnHappy()) && (!animal.isUnHungry()) && (!animal.isSick())) {
            animal.addClear(-2.0d * 1.2d);
        }
        if ((animal.isSick()) && (!animal.isUnHappy()) && (!animal.isUnHungry())) {
            animal.addClear(-2.0d * 2.0d);
        }
        if ((animal.isSick()) && (animal.isUnHappy()) && (!animal.isUnHungry())) {
            animal.addClear(-2.0d * 2.0d * 1.2d);
        }
        if ((animal.isSick()) && (!animal.isUnHappy()) && (animal.isUnHungry())) {
            animal.addClear(-2.0d * 2.0d * 1.5d);
        }
        if ((!animal.isSick()) && (animal.isUnHappy()) && (animal.isUnHungry())) {
            animal.addClear(-2.0d * 1.2d * 1.5d);
        } else {
            animal.addClear(-2.0d);
        }
    }
}
