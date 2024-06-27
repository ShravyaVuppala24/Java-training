package Concepts.Interface;

public class Doll implements Manufacture{

    @Override
    public void prepare() {
        System.out.println("Doll is being Manufactured");
    }

    @Override
    public void sell() {
        System.out.println("Doll is being sold");

    }
}
