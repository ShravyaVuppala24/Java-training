package Concepts.Interface;

public class Truck implements Manufacture{

    @Override
    public void prepare() {
        System.out.println("Truck is being Manufactured");
    }

    @Override
    public void sell() {
        System.out.println("Truck is being sold");

    }
}
