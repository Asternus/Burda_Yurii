package com.burda.modul3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "internet")
public class Internet {
    @Id
    @Column(name = "internet_id", nullable = false)
    private Long id;

    @Column(name = "traffic", nullable = false)
    private Long traffic;

    public Long getTraffic() {
        return traffic;
    }

    public void setTraffic(Long traffic) {
        this.traffic = traffic;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}