package com.burda.module2.service;

import com.burda.module2.model.*;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ShopService {
    private static final Random random = new Random();
    private static final int limit = random.nextInt(3000) + 900;
    private final Invoice invoice = new Invoice();
    private final ArrayList<Sale> sales = invoice.getSales();
    public static final Map<Customer, ArrayList<Sale>> ledger = new LinkedHashMap<>();
    private static final ArrayList<Sale> saleList = new ArrayList<>();
    private static final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    private static final Map<String, Integer> values = new LinkedHashMap<>();
    private static final SimpleDateFormat format = new SimpleDateFormat("E yyyy.MM.dd. 'T' hh:mm:ss");

    public static ArrayList<Sale> readCsv(String string) {
        String temp;
        int mark = 0;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(classLoader.getResourceAsStream(string))));
            while ((temp = reader.readLine()) != null) {
                String[] split = temp.trim().split(",");
                if (mark == 0) {
                    for (int i = 0; i < split.length; i++) {
                        values.put(split[i], i);
                    }
                    mark++;
                } else {
                    Sale sale;
                    if (split[values.get("type")].equals("Television")) {
                        sale = new Television();
                    } else {
                        sale = new Telephone();
                    }
                    sale.setType(split[values.get("type")]);
                    sale.setCountry(split[values.get("country")]);
                    sale.setDiagonal(split[values.get("diagonal")]);
                    sale.setModel(split[values.get("model")]);
                    sale.setPrice(split[values.get("price")]);
                    sale.setSeries(split[values.get("series")]);
                    sale.setScreenType(split[values.get("screen type")]);
                    saleList.add(sale);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return saleList;
    }

    public static class InvalidString extends Exception {
        @Override
        public String getMessage() {
            return "Error";
        }
    }

    public void createOrder(Customer customer) {
        ArrayList<Sale> order = new ArrayList<>();
        int size = random.nextInt(5) + 1;
        for (int i = 0; i < size; i++) {
            if (sales.get(i).isEmptyLine()) {
                try {
                    throw new InvalidString();
                } catch (InvalidString e) {
                    e.getMessage();
                }
            } else {
                order.add(sales.get(i));
            }
        }
        customer.setTotalAmount(checkOrder(order));
        customer.setTotalSize(order.size());
        createLog(customer);
        ledger.put(customer, order);
        customer.setOrderType(invoice.getType());
    }

    private void createLog(Customer customer) {
        Date date = new Date();
        File log = new File("Log.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(log, true))) {
            bufferedWriter.write(format.format(date) + ", customer: " + customer.getEmail() + ", " + invoice.getType() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int checkOrder(ArrayList<Sale> sales) {
        int price = 0;
        for (Sale sale : sales) {
            price += sale.getPrice();
        }
        if (price > limit) {
            invoice.setType("wholesale");
        } else {
            invoice.setType("retail");
        }
        return price;
    }
}