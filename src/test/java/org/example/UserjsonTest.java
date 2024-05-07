package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserjsonTest {

    private Userjson userjson;
    @BeforeEach
    void setUp() {
        userjson = new Userjson("test",20);
    }

    @AfterEach
    void tearDown() {
        userjson = null;
    }

    @Test
    void getName() {
        userjson.getName();
    }

    @Test
    void setName() {
        userjson.setName("abc");
    }

    @Test
    void getAge() {
        userjson.getAge();
    }

    @Test
    void setAge() {
        userjson.setAge(20);
    }
}