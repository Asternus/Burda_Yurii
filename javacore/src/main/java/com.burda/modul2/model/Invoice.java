package com.burda.modul2.model;

import lombok.Data;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@Data
public class Invoice implements Comparable<Invoice> {
    private static Random random = new Random();
    private int max = random.nextInt(5000) + 2000;
    private String type;
    private String orderType;
    private List<Telephone> telephoneList = new LinkedList<>();
    private List<Television> televisionList = new LinkedList<>();
    private Customer customer;
    private int totalOrderSum;
    private int totalOrderSize;

    @Override
    public int compareTo(Invoice o) {
        return Integer.compare(totalOrderSum, o.totalOrderSum);
    }
}
