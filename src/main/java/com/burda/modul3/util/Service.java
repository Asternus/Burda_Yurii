package com.burda.modul3.util;

import com.burda.modul3.entity.Equipment;
import com.burda.modul3.entity.Message;
import com.burda.modul3.entity.Subscriber;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class Service {

    public List<Message> getMessageByWord(String string) {
        string = '%' + string + '%';
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("from Message WHERE text LIKE :text", Message.class);
        query.setParameter("text", string);
        query.setMaxResults(1);
        Transaction transaction = session.beginTransaction();
        List<Message> messages = query.getResultList();
        transaction.commit();
        session.close();
        return messages;
    }

    public Equipment getMostPopularEquipment() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Equipment WHERE id IN (SELECT s.equipment.id FROM Subscriber s GROUP BY s.equipment.id ORDER BY count(s.equipment) DESC)", Equipment.class);
        query.setMaxResults(1);
        Transaction transaction = session.beginTransaction();
        Equipment equipment = (Equipment) query.getSingleResult();
        transaction.commit();
        session.close();
        return equipment;
    }

    public String mostPopularService() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query queryMessages = session.createQuery("SELECT sum(s.countMessages) FROM Subscriber s");
        queryMessages.setMaxResults(1);
        Query queryInternet = session.createQuery("SELECT sum(s.countInternet) FROM Subscriber s");
        queryInternet.setMaxResults(1);
        Query queryCall = session.createQuery("SELECT sum(s.countCall) FROM Subscriber s");
        queryCall.setMaxResults(1);
        Transaction transaction = session.beginTransaction();
        Long sumMessages = (Long) queryMessages.getSingleResult();
        Long sumInternet = (Long) queryInternet.getSingleResult();
        Long sumCall = (Long) queryCall.getSingleResult();
        transaction.commit();
        session.close();
        return (sumCall > sumMessages && sumCall > sumInternet) ? "Звонки самые популярные" : (sumMessages > sumCall && sumMessages > sumInternet) ? "Сообщения самые популярные" : "Интернет самый популярный";
    }

    public List<Subscriber> getListOfTopMessages() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Subscriber ORDER BY (countMessages) DESC");
        query.setMaxResults(5);
        Transaction transaction = session.beginTransaction();
        List<Subscriber> subscribers = query.getResultList();
        transaction.commit();
        session.close();
        return subscribers;
    }

    public List<Subscriber> getListOfTopCall() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Subscriber ORDER BY (countCall) DESC");
        query.setMaxResults(5);
        Transaction transaction = session.beginTransaction();
        List<Subscriber> subscribers = query.getResultList();
        transaction.commit();
        session.close();
        return subscribers;
    }

    public List<Subscriber> getListOfTopInternet() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Subscriber ORDER BY (countInternet) DESC");
        query.setMaxResults(5);
        Transaction transaction = session.beginTransaction();
        List<Subscriber> subscribers = query.getResultList();
        transaction.commit();
        session.close();
        return subscribers;
    }

    public List<Subscriber> getListActivity() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Subscriber ORDER BY (countInternet + countCall + countMessages) DESC");
        query.setMaxResults(5);
        Transaction transaction = session.beginTransaction();
        List<Subscriber> subscribers = query.getResultList();
        transaction.commit();
        session.close();
        return subscribers;
    }

    public String getGenderCount() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query queryFemale = session.createQuery("SELECT count (s.id) FROM Subscriber s where s.gender like :name");
        queryFemale.setParameter("name", "Female");
        queryFemale.setMaxResults(1);
        Query queryMale = session.createQuery("SELECT count (s.id) FROM Subscriber s where s.gender like :name");
        queryMale.setParameter("name", "Male");
        queryMale.setMaxResults(1);
        Query max = session.createQuery("SELECT count (s.id) FROM Subscriber s");
        max.setMaxResults(1);
        Transaction transaction = session.beginTransaction();
        Long sumFemale = (Long) queryFemale.getSingleResult();
        Long sumMale = (Long) queryMale.getSingleResult();
        Long maxSubscribers = (Long) max.getSingleResult();
        Long anotherGender = maxSubscribers - (sumFemale + sumMale);
        transaction.commit();
        session.close();
        return "Female count : " + sumFemale + "\n" + "Male count : " + sumMale + "\n" + "Another gender : " + anotherGender;
    }

    public String getMostPopularTariff() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query querySmart = session.createQuery("SELECT count (s.id) FROM Subscriber s where s.tariffs.tariffName like :name");
        querySmart.setParameter("name", "smart");
        querySmart.setMaxResults(1);
        Query queryLite = session.createQuery("SELECT count (s.id) FROM Subscriber s where s.tariffs.tariffName like :name");
        queryLite.setParameter("name", "lite");
        queryLite.setMaxResults(1);
        Query queryStandart = session.createQuery("SELECT count (s.id) FROM Subscriber s where s.tariffs.tariffName like :name");
        queryStandart.setParameter("name", "standart");
        queryStandart.setMaxResults(1);
        Transaction transaction = session.beginTransaction();
        Long smart = (Long) querySmart.getSingleResult();
        Long lite = (Long) queryLite.getSingleResult();
        Long standart = (Long) queryStandart.getSingleResult();
        transaction.commit();
        session.close();
        return "Tariff smart count: " + smart + "\n" + "Tariff lite count: " + lite + "\n" + "Tariff standart count: " + standart;
    }

}
