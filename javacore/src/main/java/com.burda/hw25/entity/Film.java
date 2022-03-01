package com.burda.hw25.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "film_id", nullable = false)
    private Integer idFilm;
    @Column
    private String name;
    @Column
    private Date date;

    public Film() {
    }

    public Film(String name, Date date) {
        this.name = name;
        this.date = date;
    }
}
