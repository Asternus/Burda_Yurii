package com.burda.modul2;

import com.burda.modul2.model.Customer;
import com.burda.modul2.servise.PersonService;
import com.burda.modul2.servise.ShopService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String csvFile = "Modul2.csv";
        createOrders(csvFile);
        Statistics.quantitySold();
        Statistics.totalSale();
        System.out.println("Min sale : " + Statistics.minSale());
        Statistics.numberOfOrders();
        System.out.println("First three purchases : " + Statistics.firstThree());
        Statistics.underEighteen();
        Statistics.sortOrders();
    }

    public static void createOrders(String csvFile) {
        List<Customer> customerList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Customer customer = PersonService.randomCustomer();
            customerList.add(customer);
        }
        for (int i = 0; i < 15; i++) {
            ShopService.createOrder(customerList.get(i), csvFile);
        }
    }
}
