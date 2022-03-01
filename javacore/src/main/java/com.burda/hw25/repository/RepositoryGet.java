package com.burda.hw25.repository;

import com.burda.hw25.HibernateUtil;
import com.burda.hw25.entity.Film;
import com.burda.hw25.entity.SessionFilm;
import com.burda.hw25.entity.Ticket;
import com.burda.hw25.entity.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class RepositoryGet {
    public static void getUsers() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query usersQuery = session.createQuery("from Users ", Users.class);
        List<Users> usersList = usersQuery.getResultList();
        transaction.commit();
        session.close();
        System.out.println("Users list: " + usersList.toString());
    }

    public static void getSessionFilms() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query usersQuery = session.createQuery("from SessionFilm ", SessionFilm.class);
        List<SessionFilm> sessionFilmList = usersQuery.getResultList();
        transaction.commit();
        session.close();
        System.out.println("Session Films list: " + sessionFilmList.toString());
    }

    public static void getFilmName(String string) {
        string = "%" + string + "%";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query usersQuery = session.createQuery("from Film WHERE name LIKE :name", Film.class);
        usersQuery.setParameter("name", string);
        List<Film> filmList = usersQuery.getResultList();
        transaction.commit();
        session.close();
        System.out.println("Films where name like by " + string.replace("%", "") + ": " + filmList.toString());
    }

    public static void getTicketList(Users users) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query usersQuery = session.createQuery("from Ticket where users =:UsersID", Ticket.class);
        usersQuery.setParameter("UsersID", users);
        List<Ticket> ticketList = usersQuery.getResultList();
        transaction.commit();
        session.close();
        System.out.println("Ticket list user id " + users.getUserId() + ": " + ticketList.toString());
    }
}