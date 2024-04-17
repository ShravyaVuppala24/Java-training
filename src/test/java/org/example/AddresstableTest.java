package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
public class AddresstableTest {

        private SessionFactory sessionFactory;
        private Session session;

        @Before
        public void setUp() {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
        }

        @After
        public void tearDown() {
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        }

        @Test
        public void testFetchData() {
            List<Addresstable> entities = session.createQuery("from Addresstable", Addresstable.class).list();
            for (Addresstable entity : entities) {
                System.out.println("City: " + entity.getCity() + ", Country: " + entity.getCountry() + " ,Pincode: " +entity.getPincode());
            }
        }
    }

