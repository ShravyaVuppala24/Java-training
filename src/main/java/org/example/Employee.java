package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

    // Java Program to Illustrate Creation of Simple POJO Class

// Importing required classes

    @Entity
    @Table(name = "employee")

// POJO class
    public class Employee {

        @Id @Column(name = "empID") private int empid;

        @Column(name = "empName") private String empName;

        @Column(name = "dept") private String dept;

        public int getempId() { return empid; }

        public void setempId(int empid) { this.empid = empid; }

        public String getempName() { return empName; }

        public void setempName(String empName)
        {
            this.empName = empName;
        }

        public String getdept() { return dept; }

        public void setdept(String dept)
        {
            this.dept = dept;
        }
    }

