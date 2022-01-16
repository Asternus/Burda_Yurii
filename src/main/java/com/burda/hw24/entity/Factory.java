package com.burda.hw24.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "factory")
@Data
public class Factory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "factory_id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    public Factory() {
    }

    public Factory(String name, String country) {
        this.name = name;
        this.country = country;
    }
}