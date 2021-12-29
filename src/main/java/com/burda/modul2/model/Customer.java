package com.burda.modul2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer implements Comparable<Customer> {
    private int id;
    private String email;
    private int age;
    private int totalAmount;
    private String orderType;
    private int totalSize;

    public Customer(int id, String email, int age) {
        this.id = id;
        this.email = email;
        this.age = age;
    }

    @Override
    public int compareTo(Customer o) {
        return Integer.compare(totalAmount, o.totalAmount);
    }
}
