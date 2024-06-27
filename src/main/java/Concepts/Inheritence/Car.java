package Concepts.Inheritence;

public class Car extends Vehicle {
    public Car()
    {
        System.out.println("This is a Car class");
    }
    @Override
    public void name() {
        System.out.println("Name: Car");
    }

    @Override
    public void Tires() {
        System.out.println("Car Has 4 wheels");
    }
}
