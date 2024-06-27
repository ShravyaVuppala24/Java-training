package Concepts.Interface;

public class main {
    public static void  main(String[] args)
    {
        Manufacture m = new Doll();
        m.prepare();
        m.sell();
        Manufacture m1 = new Truck();
        m1.prepare();
        m1.sell();
    }
}
