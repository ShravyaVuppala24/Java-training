package jaxB;
import javax.xml.bind.annotation.*;

@XmlRootElement
public class Employee {
    private int empno;
    private String fname;
    private String lname;

    public Employee(){}

    public Employee(int employeeNo, String name, String lastName) {
        this.empno = employeeNo;
        this.fname = name;
        this.lname = lastName;
    }
    @XmlElement
    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    @XmlElement
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @XmlElement
    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
