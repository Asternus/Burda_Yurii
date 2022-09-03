package com.burda.hw24.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "device")
@Data
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "device_id", nullable = false)
    private Integer id;

    @Column(name = "type")
    private String type;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @Column(name = "availability")
    private Boolean availability;

    @ManyToOne
    @JoinColumn(name = "factory_id")
    private Factory factory;

    public Device() {
    }

    public Device(String type, String name, Double price, LocalDate date, String description, Boolean availability, Factory factory) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.date = date;
        this.description = description;
        this.availability = availability;
        this.factory = factory;
    }

    public Device(Integer id, String type, String name, Double price, LocalDate date, String description, Boolean availability, Factory factory) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
        this.date = date;
        this.description = description;
        this.availability = availability;
        this.factory = factory;
    }
}