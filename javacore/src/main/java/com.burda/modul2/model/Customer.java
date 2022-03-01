package com.burda.modul2.model;

import lombok.Data;

@Data
public class Customer implements Comparable<Customer> {
    private int id;
    private String email;
    private int age;

    public Customer(int id, String email, int age) {
        this.id = id;
        this.email = email;
        this.age = age;
    }

    @Override
    public int compareTo(Customer o) {
        return Integer.compare(age, o.age);
    }
}