package com.burda.hw24.repository;

import com.burda.hw24.util.HibernateUtil;
import com.burda.hw24.entity.Device;
import com.burda.hw24.entity.Factory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;

public class RepositoryUpdate {

    public static Factory addFactory(String name, String country) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Factory factory = new Factory(name, country);
        session.save(factory);
        transaction.commit();
        session.close();
        return factory;
    }

    public static Device addDevice(String type, String name, Double price, LocalDate localDate, String description, Boolean availability, Factory factory) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Device device = new Device(type, name, price, localDate, description, availability, factory);
        session.save(device);
        transaction.commit();
        session.close();
        return device;
    }

    public static void delDevice(Device device) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(device);
        transaction.commit();
        session.close();
        System.out.println("Delete " + device);
    }

    public static void updateDevice(Device device) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(device);
        transaction.commit();
        session.close();
        System.out.println("update " + device);
    }
}
