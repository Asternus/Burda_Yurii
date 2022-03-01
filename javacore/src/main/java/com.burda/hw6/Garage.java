package com.burda.hw6;

public class Garage {
    public static void checkСar(Car car) {

        if (car.isEnoughPetrolLevel()) {
            System.out.println("Уровень бензина достаточный");
        } else {
            System.out.println("Проверку бензина провалил, так как бензина < 50");
        }
        if (car.getPowType().getPower() > 200) {
            System.out.println("С двиготелем все хорошо");
        } else {
            System.out.println("Проверку двигатель не прошел, так как заряд < 200");
        }
    }
}
