package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddresstableTest {

            private SessionFactory sessionFactory;
        private Session session;
     private Addresstable addresstable;

    @BeforeEach
    void setUp() {
//        sessionFactory = new Configuration().configure().buildSessionFactory();
//            session = sessionFactory.openSession();
//            session.beginTransaction();
          addresstable = new Addresstable();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getCity() {
    }

    @Test
    void setCity() {
    }

    @Test
    void getCountry() {
    }

    @Test
    void setCountry() {
    }

    @Test
    void getPincode() {
        addresstable.getPincode();
    }

    @Test
    void setPincode() {
    }
}