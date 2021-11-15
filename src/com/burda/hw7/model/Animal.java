package com.burda.hw7.model;

public class Animal {

    private final String name;
    private final AnimalType type;
    private int age;
    private double hungry;
    private int money;
    private double clear;
    private double happy;
    private boolean sick;
    private String presents;

    public Animal(String name, AnimalType type) {
        this.name = name;
        this.type = type;
        this.age = 1;
        this.hungry = 100.0d;
        this.money = 0;
        this.clear = 100.0d;
        this.happy = 50.0d;
        this.sick = false;
        this.presents = "";
    }

    public String getPresents() {
        return presents;
    }

    public void setPresents(String presents) {
        this.presents = presents;
    }

    public void addPresents(String presents) {
        this.presents += " Подарок " + presents + ";";
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
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public double getClear() {
        return clear;
    }

    public void setClear(double clear) {
        this.clear = clear;
    }

    public void addClear(double clear) {
        this.clear += clear;
    }

    public double getHappy() {
        return happy;
    }

    public void setHappy(double happy) {
        this.happy = happy;
    }

    public void addHappy(double happy) {
        this.happy += happy;
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
                ", collections=" + presents +
                '}';
    }
}
