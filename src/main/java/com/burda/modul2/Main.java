package com.burda.modul2;

import com.burda.modul2.model.Customer;
import com.burda.modul2.service.PersonService;
import com.burda.modul2.service.ShopService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShopService shopService = new ShopService();
        PersonService personService = new PersonService();
        createOrders(shopService, personService);
        Statistics.quantitySold("Television");
        Statistics.quantitySold("Telephone");
        System.out.println("Min sale : " + Statistics.minSale());
        Statistics.totalSale();
        Statistics.numberOfOrders();
        System.out.println("First three purchases : " + Statistics.firstThree());
        Statistics.underEighteen();
        Statistics.sortOrders();
    }

    public static void createOrders(ShopService shopService, PersonService personService) {
        List<Customer> customerList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            Customer customer = personService.randomCustomer();
            customerList.add(customer);
        }
        for (int i = 0; i < 15; i++) {
            shopService.createOrder(customerList.get(i));
        }
    }
}
