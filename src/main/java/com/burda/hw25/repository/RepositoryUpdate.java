package com.burda.hw25.repository;

import com.burda.hw25.HibernateUtil;
import com.burda.hw25.entity.Film;
import com.burda.hw25.entity.SessionFilm;
import com.burda.hw25.entity.Ticket;
import com.burda.hw25.entity.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Date;

public class RepositoryUpdate {
    public static SessionFilm addSessionFilm(Integer place, Integer roomNumber, Film film) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        SessionFilm sessionFilm = new SessionFilm(place, roomNumber, film);
        session.save(sessionFilm);
        transaction.commit();
        session.close();
        return sessionFilm;
    }

    public static Ticket addTicket(SessionFilm sessionFilm, Users users, Date date, Integer placeNumber) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Ticket ticket = new Ticket(sessionFilm, users, date, placeNumber);
        session.save(ticket);
        transaction.commit();
        session.close();
        return ticket;
    }

    public static Film addFilm(String name, Date date) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Film film = new Film(name, date);
        session.save(film);
        transaction.commit();
        session.close();
        return film;
    }

    public static Users addUser(String name, Date date) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Users users = new Users(name, date);
        session.save(users);
        transaction.commit();
        session.close();
        return users;
    }

    public static void delTicket(Ticket ticket) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(ticket);
        transaction.commit();
        session.close();
        System.out.println("Delete " + ticket);
    }
}