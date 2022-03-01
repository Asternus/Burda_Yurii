package com.burda.hw24.repository;

import com.burda.hw24.util.HibernateUtil;
import com.burda.hw24.entity.Device;
import com.burda.hw24.entity.Factory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class RepositoryGet {
    public static void getDevice(Integer integer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query usersQuery = session.createQuery("from Device where id = :idDevice", Device.class);
        usersQuery.setParameter("idDevice", integer);
        System.out.println(usersQuery.getSingleResult());
        transaction.commit();
        session.close();
    }

    public static void getFactory(Integer integer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query usersQuery = session.createQuery("from Factory where id =:factoryId", Factory.class);
        usersQuery.setParameter("factoryId", integer);
        List<Device> deviceList = usersQuery.getResultList();
        transaction.commit();
        session.close();
        System.out.println("Factory list: " + deviceList.toString());
    }

    public static void getDivByFactoryId(Integer integer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Device as device inner join fetch device.factory where device.factory.id = :factoryId");
        query.setParameter("factoryId", integer);
        List<Device> deviceList = query.getResultList();
        transaction.commit();
        session.close();
        System.out.println("Factory list (join): " + deviceList.toString());
    }

    public static void getSum() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "select d.factory.id, sum(d.price), count (d.id) from Device as d group by d.factory.id order by d.factory.id";
        List<?> list = session.createQuery(hql).list();
        System.out.println("Group by: ");
        for (int i = 0; i < list.size(); i++) {
            Object[] row = (Object[]) list.get(i);
            System.out.println("Фабрика № " + row[0] + ", Колличесво устройсв: " + row[2] + ", сумма всех устройств: " + row[1]);
        }
        session.close();
    }
}
