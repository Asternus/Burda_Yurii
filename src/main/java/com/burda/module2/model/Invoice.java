package com.burda.module2.model;

import com.burda.module2.service.ShopService;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Invoice {
    private final ArrayList<Sale> sales = ShopService.readCsv("saleList.csv");
    private String type;
}
