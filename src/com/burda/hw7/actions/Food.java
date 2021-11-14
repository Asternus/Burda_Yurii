package com.burda.hw7.actions;

import com.burda.hw7.model.Animal;

public class Food {
    public void doAction(Animal animal) {
        animal.addHungry(5.0d);
        animal.addClear(-2);
    }
}
