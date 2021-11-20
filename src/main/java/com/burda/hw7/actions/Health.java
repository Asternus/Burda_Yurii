package com.burda.hw7.actions;

import com.burda.hw7.model.Animal;

public class Health {

    public void doAction(Animal animal) {

        if (animal.getMoney() < 50) {
            System.out.println("У вас недостаточно денег");
        } else {
            animal.setHappy(10.0d);
            animal.setHungry(70.0d);
            animal.setClear(80.0d);
            animal.addMoney(-50);
            animal.setSick(false);
            animal.setUnHungry(false);
        }
    }
}
