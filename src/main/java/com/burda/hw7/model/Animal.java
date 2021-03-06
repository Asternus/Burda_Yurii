package com.burda.hw7.model;

import java.util.Arrays;
import java.util.Random;

public class Animal {

    private final String name;
    private final AnimalType type;
    private int age;
    private double hungry;
    private int money;
    private double clear;
    private double happy;
    private boolean sick;
    private boolean unHappy;
    private boolean unHungry;
    private String[] present;
    private final Random random = new Random();

    public void setPresent(String[] present) {
        this.present = present;
    }

    public boolean isUnHappy() {
        return unHappy;
    }

    public void setUnHappy(boolean unHappy) {
        this.unHappy = unHappy;
    }

    public boolean isUnHungry() {
        return unHungry;
    }

    public void setUnHungry(boolean unHungry) {
        this.unHungry = unHungry;
    }


    public Animal(String name, AnimalType type) {
        this.name = name;
        this.type = type;
        this.age = 1;
        this.hungry = 100.0d;
        this.money = 0;
        this.clear = 100.0d;
        this.happy = 50.0d;
        this.unHungry = false;
        this.unHappy = false;
        this.sick = false;
        this.present = new String[3];
    }

    public void presents() {
        String gift = "Подарок " + String.valueOf(random.nextInt(300));
        if (present[present.length - 1] != null) {
            String[] newPresent = new String[present.length + (present.length / 2)];
            newPresent = Arrays.copyOf(present, present.length + 1);
            newPresent[present.length] = gift;
            this.present = newPresent;
        } else {
            for (int i = 0; i < present.length; i++) {
                String temp = present[i];
                if (temp == null) {
                    present[i] = gift;
                    break;
                }
            }
        }
    }

    public double isUnHappyRet() {
        if (unHappy) {
            return 1.2d;
        } else {
            return 1d;
        }
    }

    public double unHungryRet() {
        if (unHungry) {
            return 1.5d;
        } else {
            return 1d;
        }
    }

    public double isSicRet() {
        if (sick) {
            return 2d;
        } else {
            return 1d;
        }
    }

    public void setInfo() {
        if (hungry < 50) {
            setUnHungry(true);
        }
        if (hungry > 50) {
            setUnHungry(false);
        }
        if (happy < 20) {
            setUnHappy(true);
        }
        if (happy > 20) {
            setUnHappy(false);
        }
    }

    public boolean isSick() {
        return sick;
    }

    public void setSick(boolean sick) {
        this.sick = sick;
    }

    public String getName() {
        return name;
    }

    public AnimalType getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addAge(int age) {
        this.age += age;
    }

    public double getHungry() {
        return hungry;
    }

    public void setHungry(double hungry) {
        this.hungry = hungry;
    }

    public void addHungry(double hungry) {
        this.hungry += hungry;
        setInfo();
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addMoney(int money) {
        this.money += money;
        setInfo();
    }

    public double getClear() {
        return clear;
    }

    public void setClear(double clear) {
        this.clear = clear;
    }

    public void addClear(double clear) {
        this.clear += clear;
        setInfo();
    }

    public double getHappy() {
        return happy;
    }

    public void setHappy(double happy) {
        this.happy = happy;
    }

    public void addHappy(double happy) {
        this.happy += happy;
        setInfo();
    }

    public void sick() {
        final int randomNumber = random.nextInt(100);
        if (clear < 50) {
            if (randomNumber <= 30) {
                sick = true;
            }
        } else {
            if (randomNumber <= 10) {
                sick = true;
            }
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", age=" + age +
                ", hungry=" + hungry +
                ", money=" + money +
                ", clear=" + clear +
                ", happy=" + happy +
                ", sick=" + sick +
                ", unHungry=" + unHungry +
                ", unHappy=" + unHappy +
                ", presents=" + Arrays.toString(present) +
                '}';
    }
}
