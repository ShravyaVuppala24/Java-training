package org.hibernate;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.webservice.Service;

class ServiceTest {

    @Test
    void ServiceTest(){
        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        String input = "Niharika";
        String result = service.getName("Niharika");
        Assertions.assertEquals("Niharika",result);
    }



}