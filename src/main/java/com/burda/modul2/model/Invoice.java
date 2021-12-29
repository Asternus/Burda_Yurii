package com.burda.modul2.model;

import com.burda.modul2.service.ShopService;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Invoice {
    private final ArrayList<Sale> sales = ShopService.readCsv("saleList.csv");
    private String type;
}
