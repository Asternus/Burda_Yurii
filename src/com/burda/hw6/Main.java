package com.burda.hw6;

public class Main {
    public static void main(String[] args) {

        Engine myEn = new Engine();
        myEn.setPower(150.00d);
        myEn.setType("Electronic");
        Engine myEn2 = new Engine();
        myEn2.setPower(200.00d);
        myEn2.setType("Diesel");

        Car myCar = new Car(Manufacturer.Mercedes, myEn, "black");
        Car myCar2 = new Car(Manufacturer.Tesla, myEn2, "red");

        System.out.println(myCar);
        System.out.println(myCar2);
        myCar.startEngine("Yurii");
        myCar2.startEngine("Raccoon");

        Garage.checkСar(myCar);
        Garage.checkСar(myCar2);

        // System.out.println(myCar.isEnoughPetrolLevel());
        // System.out.println(myCar2.isEnoughPetrolLevel());
    }
}

