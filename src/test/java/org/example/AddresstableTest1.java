package org.example;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

class AddresstableTest1 {

//        private SessionFactory sessionFactory;
//        private Session session;
       // private Addresstable addresstable;

        @BeforeEach
        public void setUp() {
//            sessionFactory = new Configuration().configure().buildSessionFactory();
//            session = sessionFactory.openSession();
//            session.beginTransaction();
          //  addresstable = new Addresstable();
        }

        @AfterEach
        public void tearDown() {
//            session.getTransaction().commit();
//            session.close();
//            sessionFactory.close();
           // addresstable=null;
        }

        @Test
        public void fetchData() {
//            List<Addresstable> entities = session.createQuery("from Addresstable", Addresstable.class).list();
//            for (Addresstable entity : entities) {
//                System.out.println("City: " + entity.getCity() + ", Country: " + entity.getCountry() + " ,Pincode: " +entity.getPincode());
//            }
        }

        @Test
        public void fetchData1() {
//            addresstable.setCity("Bangalore");
//            addresstable.setCountry("India");
//            addresstable.setPincode(123456);
//            System.out.println("============================="+addresstable.getCity());
//            System.out.println("============================="+addresstable.getPincode());
//            System.out.println("============================="+addresstable.getCountry());

        }

    @Test
    public void getCity() {
    }

    @Test
    public void setCity() {
    }

    @Test
    public void getCountry() {
    }

    @Test
    public void setCountry() {
    }

    @Test
    public void getPincode() {
    }

    @Test
    public void setPincode() {
    }
}

