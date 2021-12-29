package com.burda.module2;

import com.burda.module2.model.Customer;
import com.burda.module2.service.ShopService;

import java.util.*;
import java.util.stream.Collectors;

public class Statistics {

    public static void quantitySold(String type) {
        System.out.println(type + " quantity sold : " + ShopService.ledger.values().stream()
                .flatMap(Collection::stream)
                .filter(x -> x.getType().equals(type)).toList().size());
    }

    public static String minSale() {
        ArrayList<Customer> customers = new ArrayList<>(ShopService.ledger.keySet());
        final Customer customer = customers.stream().
                min(Customer::compareTo).
                orElseThrow(IllegalStateException::new);
        return customer.toString() + " and sale " + ShopService.ledger.get(customer);
    }

    public static void totalSale() {
        ArrayList<Customer> customers = new ArrayList<>(ShopService.ledger.keySet());
        System.out.println("Total sale : " + customers.stream()
                .mapToInt(Customer::getTotalAmount)
                .sum());
    }

    public static void numberOfOrders() {
        ArrayList<Customer> customers = new ArrayList<>(ShopService.ledger.keySet());
        System.out.println("Number of retail orders : " + customers.stream()
                .filter(x -> x.getOrderType().equals("retail")).count());
    }

    public static LinkedHashMap<Object, Object> firstThree() {

        return ShopService.ledger.entrySet()
                .stream()
                .limit(3)
                .collect(LinkedHashMap::new, (k, v) -> k.put(v.getKey(), v.getValue()), Map::putAll);
    }

    public static void underEighteen() {
        ArrayList<Customer> customers = new ArrayList<>(ShopService.ledger.keySet());

        System.out.println("Under 18 : " + customers.stream()
                .filter(x -> x.getAge() < 18)
                .peek(x -> x.setOrderType("low_age"))
                .map(Customer::toString).toList());
    }

    public static void sortOrders() {
        ArrayList<Customer> customers = new ArrayList<>(ShopService.ledger.keySet());

        System.out.println("Sorted order : \n" + customers.stream()
                .sorted(Comparator.comparing(Customer::getAge)
                        .thenComparing(Customer::getTotalSize)
                        .thenComparing(Customer::getTotalAmount)).map(Customer::toString)
                .collect(Collectors.joining("\n")));
    }
}
