package com.burda.hw11;

public class Service {


    public String foundError(Phone phone) {
        if (phone.call() == null) {
            return "Ошибка звонка";
        }
        if (phone.sms() == null) {
            return "Ошибка Смс";
        } else {
            return "All ok";
        }
    }

    public void giveMethod(Phone phone) {
        if (phone instanceof Smartphone) {
            Smartphone smartphone = (Smartphone) phone;
            smartphone.serfInternet();
        }
        if (phone instanceof RotaryPhone) {
            RotaryPhone rotaryPhone = (RotaryPhone) phone;
            rotaryPhone.play();
        }
        if (phone instanceof CellularPhone) {
            CellularPhone cellularPhone = (CellularPhone) phone;
            cellularPhone.calculator();
        }
    }

    public void testPhone(Phone phone) {

        String result = foundError(phone);

        if (result.equals("Ошибка звонка") || result.equals("Ошибка Смс")) {
            System.out.println("Ошибка звонка или смс");
            phone.app();
            phone.menu();
            phone.call();
            phone.sms();
            giveMethod(phone);
        } else {
            System.out.println("all ok");
        }
    }

}
