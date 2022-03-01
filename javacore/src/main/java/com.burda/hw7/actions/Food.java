package com.burda.hw7.actions;

import com.burda.hw7.model.Animal;

public class Food {
    public void doAction(Animal animal) {

        double index = 1 * animal.unHungryRet() * animal.isUnHappyRet() * animal.isSicRet();
        animal.addHungry(5.0);
        animal.addClear(- 2.0d * index);

    }
}
