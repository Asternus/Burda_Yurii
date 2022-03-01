package com.burda.hw25.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SessionFilm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "session_id", nullable = false)
    private Integer idSession;
    @Column
    private Integer place;
    @Column
    private Integer roomNumber;
    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    public SessionFilm() {
    }

    public SessionFilm(Integer place, Integer roomNumber, Film film) {
        this.place = place;
        this.roomNumber = roomNumber;
        this.film = film;
    }
}
