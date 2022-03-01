package com.burda.hw25.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id", nullable = false)
    private Integer idTicket;
    @ManyToOne
    @JoinColumn(name = "session_id")
    private SessionFilm sessionFilm;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
    @Column
    private Date date;
    @Column
    private Integer placeNumber;

    public Ticket() {
    }

    public Ticket(SessionFilm sessionFilm, Users users, Date date, Integer placeNumber) {
        this.sessionFilm = sessionFilm;
        this.users = users;
        this.date = date;
        this.placeNumber = placeNumber;
    }
}
