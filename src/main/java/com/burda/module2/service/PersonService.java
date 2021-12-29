package com.burda.module2.service;

import com.burda.module2.model.Customer;

import java.util.Random;

public class PersonService {
    private static final Random random = new Random();

    public Customer randomCustomer() {
        return new Customer(random.nextInt(100000000),
                random.nextInt(5676655) + "@gmail.com",
                random.nextInt(100));
    }
}
