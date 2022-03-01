package com.burda.hw11;

public class Main {
    public static void main(String[] args) {

        RotaryPhone rotaryPhone = new RotaryPhone(Colour.RED, Years.Y1991);
        CellularPhone cellularPhone = new CellularPhone(Colour.RED, Years.Y1991);
        Smartphone smartphone = new Smartphone(Colour.RED, Years.Y1991);
        Service service = new Service();
        service.testPhone(rotaryPhone);
        service.testPhone(cellularPhone);
        service.testPhone(smartphone);

        int smart = smartphone.hashCode();
        int cell = cellularPhone.hashCode();
        if (smart != cell) {
            System.out.println("false");
        } else {
            System.out.println(cellularPhone.equals(smartphone));
        }
    }

}
