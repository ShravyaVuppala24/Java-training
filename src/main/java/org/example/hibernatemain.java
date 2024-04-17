package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class hibernatemain {

        // Main driver method
        public static void main(String[] args)
        {

            // Create Configuration
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(Employee.class);
            configuration.addAnnotatedClass(Addresstable.class);

            // Create Session Factory and auto-close with try-with-resources.
            try (SessionFactory sessionFactory
                         = configuration.buildSessionFactory()) {

                // Initialize Session Object
                Session session = sessionFactory.openSession();

                Employee emp1 = new Employee();

                emp1.setempId(1);
                emp1.setempName("Shravya");
                emp1.setdept("Backend");

                session.beginTransaction();

                // Here we have used
                // persist() method of JPA
                session.persist(emp1);

                session.getTransaction().commit();
            }
        }
    }

