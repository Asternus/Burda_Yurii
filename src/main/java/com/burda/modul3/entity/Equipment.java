package com.burda.modul3.entity;

import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@ToString
@Entity
@Table(name = "equipment")
public class Equipment {
    @Id
    @Column(name = "device_id", nullable = false)
    private Long id;

    @Column(name = "manufacturer", nullable = false)
    private String manufacturer;

    @Column(name = "type", nullable = false)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}