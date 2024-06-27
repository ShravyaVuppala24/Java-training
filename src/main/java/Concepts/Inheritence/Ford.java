package Concepts.Inheritence;

public class Ford extends Car {

    public Ford()
    {
        System.out.println("This is a Ford Class");
    }

    @Override
    public void name() {
        System.out.println("Name: Ford");
    }

    @Override
    public void Tires() {
        System.out.println("Ford has 4 wheels");
    }
}
