package com.burda.modul2.servise;

import com.burda.modul2.exception.InvalidString;
import com.burda.modul2.model.Customer;
import com.burda.modul2.model.Invoice;
import com.burda.modul2.model.Telephone;
import com.burda.modul2.model.Television;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ShopService {
    private static final Invoice invoice = new Invoice();
    private static final ClassLoader loader = Thread.currentThread().getContextClassLoader();
    private static String[] strings;
    private static final List<String> stringList = new ArrayList<>();
    private static final Random random = new Random();
    public static final Map<Customer, Invoice> payList = new LinkedHashMap<>();
    public static int telephone = 0;
    public static int television = 0;

    public static String[] getSeriesTelephone(String csvFile) {
        String series = " ";
        int i = 9;
        while (i <= 37) {
            series += getArrInvoice(csvFile)[i] + ", ";
            i += 7;
        }
        return series.replace(" ", "").split((","));
    }

    public static String[] getSeriesTelevision(String csvFile) {
        String series = " ";
        int i = 43;
        while (i <= 78) {
            series += getArrInvoice(csvFile)[i] + ", ";
            i += 7;
        }
        return series.replace(" ", "").split((","));
    }

    public static String[] getDiagonalTelephone(String csvFile) {
        String diagonal = " ";
        int i = 10;
        while (i <= 38) {
            diagonal += getArrInvoice(csvFile)[i] + ", ";
            i += 7;
        }
        return diagonal.replace(" ", "").split((","));
    }

    public static String[] getDiagonalTelevision(String csvFile) {
        String diagonal = " ";
        int i = 45;
        while (i <= 80) {
            diagonal += getArrInvoice(csvFile)[i] + ", ";
            i += 7;
        }
        return diagonal.replace(" ", "").split((","));
    }

    public static String[] getScreenTelephone(String csvFile) {
        String screen = " ";
        int i = 11;
        while (i <= 39) {
            screen += getArrInvoice(csvFile)[i] + ", ";
            i += 7;
        }
        return screen.replace(" ", "").split((","));
    }

    public static String[] getScreenTelevision(String csvFile) {
        String screen = " ";
        int i = 46;
        while (i <= 81) {
            screen += getArrInvoice(csvFile)[i] + ", ";
            i += 7;
        }
        return screen.replace(" ", "").split((","));
    }

    public static String[] getCountryTelephone(String csvFile) {
        String country = " ";
        int i = 12;
        while (i <= 40) {
            country += getArrInvoice(csvFile)[i] + ", ";
            i += 7;
        }
        return country.replace(" ", "").split((","));
    }

    public static String[] getCountryTelevision(String csvFile) {
        String country = " ";
        int i = 47;
        while (i <= 82) {
            country += getArrInvoice(csvFile)[i] + ", ";
            i += 7;
        }
        return country.replace(" ", "").split((","));
    }

    public static int[] getPriceTelephone(String csvFile) {
        String price = " ";
        int i = 13;
        while (i <= 41) {
            price += getArrInvoice(csvFile)[i] + ", ";
            i += 7;
        }
        return Arrays.stream(price.replace(" ", "").split((","))).mapToInt(Integer::parseInt).toArray();
    }

    public static int[] getPriceTelevision(String csvFile) {
        String price = "";

        int i = 48;
        while (i <= 83) {
            price += getArrInvoice(csvFile)[i] + ", ";
            i += 7;
        }
        return Arrays.stream(price.replace(" ", "").split((","))).mapToInt(Integer::parseInt).toArray();
    }

    public static String[] getArrInvoice(String csvFile) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((Objects.requireNonNull(loader.getResourceAsStream(csvFile)))));
        String temp;
        String pars = " ";
        try {
            while ((temp = bufferedReader.readLine()) != null) {
                stringList.add(Arrays.toString(temp.split(";")));
            }
            for (int i = 0; i <= 11; i++) {
                pars += stringList.get(i).replaceAll("[\\[\\]]", "") + ", ";
            }
            strings = pars.split((","));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    private static void createLog(Customer customer) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("E dd.MM.yyyy 'T' hh:mm:ss");
        File log = new File("Log.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(log, true))) {
            bufferedWriter.write(formatter.format(date) + ", " + customer + ", " + invoice + ";\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int checkLimit(Invoice invoice) {
        int telephonePrice = 0;
        int televisionPrice = 0;
        for (int i = 0; i < invoice.getTelephoneList().size(); i++) {
            telephonePrice += invoice.getTelephoneList().get(i).getPrice();
        }
        for (int i = 0; i < invoice.getTelevisionList().size(); i++) {
            televisionPrice += invoice.getTelevisionList().get(i).getPrice();
        }
        int totalPrice = telephonePrice + televisionPrice;
        if (totalPrice > invoice.getMax()) {
            invoice.setType("wholesale");
        } else {
            invoice.setType("retail");
        }
        return totalPrice;
    }

    public static void createOrder(Customer customer, String csvFile) {
        Invoice invoice = new Invoice();
        for (int i = 0; i <= random.nextInt(2); i++) {
            try {
                if (invoice.equals("")) {
                    throw new InvalidString();
                }
            } catch (InvalidString e) {
                e.printStackTrace();
            }
            invoice.getTelevisionList().add(new Television(getSeriesTelevision(csvFile)[random.nextInt(5)], getDiagonalTelevision(csvFile)[random.nextInt(5)], getScreenTelevision(csvFile)[random.nextInt(5)], getCountryTelevision(csvFile)[random.nextInt(5)], getPriceTelevision(csvFile)[random.nextInt(5)]));
            television++;
        }
        for (int i = 0; i <= random.nextInt(3); i++) {
            try {
                if (invoice.equals("")) {
                    throw new InvalidString();
                }
            } catch (InvalidString e) {
                e.printStackTrace();
            }
            invoice.getTelephoneList().add(new Telephone(getSeriesTelephone(csvFile)[random.nextInt(5)], getDiagonalTelephone(csvFile)[random.nextInt(5)], getScreenTelephone(csvFile)[random.nextInt(5)], getPriceTelephone(csvFile)[random.nextInt(5)]));
            telephone++;
        }
        invoice.setCustomer(customer);
        invoice.setTotalOrderSum(checkLimit(invoice));
        invoice.setTotalOrderSize(invoice.getTelephoneList().size() + invoice.getTelevisionList().size());
        createLog(customer);
        payList.put(customer, invoice);
        invoice.setOrderType(invoice.getType());
    }
}



