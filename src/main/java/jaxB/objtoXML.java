package jaxB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class objtoXML {
    public static void main (String args[])
    {
        Employee emp1 = new Employee();
        emp1.setEmpno(1);
        emp1.setFname("Shravya");
        emp1.setLname("Vuppala");

        try {
            // Create JAXB context and initialize Marshaller
            JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            File file = new File("src/main/resources/Employee.xml");

            // Marshal the employee object to System.out (console)
            marshaller.marshal(emp1, file);
            Employee emp2 = (Employee)unmarshaller.unmarshal(file);
            System.out.println(emp2.getEmpno() +" " +emp2.getFname() +" " +emp2.getLname());
        }
        catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}