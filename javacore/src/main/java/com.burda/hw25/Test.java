package com.burda.hw25;

import com.burda.hw25.entity.Film;
import com.burda.hw25.entity.SessionFilm;
import com.burda.hw25.entity.Ticket;
import com.burda.hw25.entity.Users;
import com.burda.hw25.repository.RepositoryUpdate;
import com.burda.hw25.repository.RepositoryGet;

import java.sql.Date;

public class Test {
    public static void main(String[] args) {
        Film film1 = RepositoryUpdate.addFilm("Terminator", Date.valueOf("2021-05-04"));
        SessionFilm sessionFilm1 = RepositoryUpdate.addSessionFilm(11, 22, film1);
        Users user1 = RepositoryUpdate.addUser("Lisa", Date.valueOf("1997-05-04"));
        Ticket ticket1 = RepositoryUpdate.addTicket(sessionFilm1, user1, Date.valueOf("2022-01-16"), 10);
        RepositoryGet.getSessionFilms();
        RepositoryGet.getUsers();
        RepositoryGet.getFilmName("Termi");
        RepositoryGet.getTicketList(user1);
        RepositoryUpdate.delTicket(ticket1);
    }
}