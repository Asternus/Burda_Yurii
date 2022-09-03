package com.burda.modul2;

import com.burda.modul2.model.Invoice;
import com.burda.modul2.servise.ShopService;

import java.util.*;
import java.util.stream.Collectors;

public class Statistics {

    public static void quantitySold() {
        System.out.println("Telephone = " + ShopService.telephone);
        System.out.println("Television = " + ShopService.television);
    }

    public static void totalSale() {
        List<Invoice> invoiceList = new ArrayList<>(ShopService.payList.values());
        System.out.println("Total sale : " + invoiceList.stream()
                .mapToInt(Invoice::getTotalOrderSum)
                .sum());
    }

    public static String minSale() {
        List<Invoice> invoices = new ArrayList<>(ShopService.payList.values());
        final Invoice invoice = invoices.stream().
                min(Invoice::compareTo).
                orElseThrow(IllegalStateException::new);
        return invoice.toString();
    }

    public static void numberOfOrders() {
        ArrayList<Invoice> customers = new ArrayList<>(ShopService.payList.values());
        System.out.println("Number of retail orders : " + customers.stream()
                .filter(x -> x.getOrderType().equals("retail")).count());
    }

    public static LinkedHashMap<Object, Object> firstThree() {

        return ShopService.payList.entrySet()
                .stream()
                .limit(3)
                .collect(LinkedHashMap::new, (k, v) -> k.put(v.getKey(), v.getValue()), Map::putAll);
    }

    public static void underEighteen() {
        List<Invoice> invoiceList = new ArrayList<>(ShopService.payList.values());

        System.out.println("Under 18 : " + invoiceList.stream()
                .filter(x -> x.getCustomer().getAge() < 18)
                .peek(x -> x.setOrderType("low_age"))
                .map(Invoice::toString).toList());
    }

    public static void sortOrders() {
        List<Invoice> invoiceList = new ArrayList<>(ShopService.payList.values());

        System.out.println("Sorted : \n" + invoiceList.stream()
                .sorted(Comparator.comparing(Invoice::getCustomer)
                        .thenComparing(Invoice::getTotalOrderSize)
                        .thenComparing(Invoice::getTotalOrderSum)).map(Invoice::toString)
                .collect(Collectors.joining("\n")));
    }
}
