package Concepts.Inheritence;

public class main {
    public static void  main(String [] args)
    {
        Vehicle v = new Ford();
        v.name();
        v.Tires();
        System.out.println("--------------------");

        Vehicle v1 = new Car();
        v1.name();
        v1.Tires();
        System.out.println("--------------------");

        Vehicle v2 = new Vehicle();
        v2.name();
        v2.Tires();
        System.out.println("--------------------");
    }
}
