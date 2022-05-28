package com.burda.modul3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tariffs")
public class Tariff {
    @Id
    @Column(name = "tariff_id", nullable = false)
    private Long id;

    @Column(name = "tariff_name", nullable = false)
    private String tariffName;

    @Column(name = "tariff_price")
    private Long tariffPrice;

    public Long getTariffPrice() {
        return tariffPrice;
    }

    public void setTariffPrice(Long tariffPrice) {
        this.tariffPrice = tariffPrice;
    }

    public String getTariffName() {
        return tariffName;
    }

    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "id=" + id +
                ", tariffName='" + tariffName + '\'' +
                '}';
    }
}