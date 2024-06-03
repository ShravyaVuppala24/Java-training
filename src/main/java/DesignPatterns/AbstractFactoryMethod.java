package DesignPatterns;

// Step 1: Define abstract product types
interface Car {
    void drive();
}
// Step 2: Define concrete products
class BabyCar implements Car {
    public void drive() {
        System.out.println("Baby Car is driving slowly...");
    }
}
class ToddlerCar implements Car {
    public void drive() {
        System.out.println("Toddler Car is driving fast...");
    }
}

// Step 3: Define abstract factory interface
interface ToyFactory {
    Car createCar();

}
class BabyToyFactory implements ToyFactory {
    public Car createCar() {
        return new BabyCar();
    }
}
class ToddlerToyFactory implements ToyFactory {
    public Car createCar() {
        return new ToddlerCar();
    }
}
// Client code
public class AbstractFactoryMethod {
    public static void main(String[] args) {
        ToyFactory babyFactory = new BabyToyFactory();
        Car bCar = babyFactory.createCar();

        bCar.drive();

        ToyFactory toddlerFactory = new ToddlerToyFactory();
        Car toddlerCar = toddlerFactory.createCar();

        toddlerCar.drive();

    }
}

//We create an object called babyFactory of ToyFactory and instantiate with BabyToyFactory, and create another object called
//bCar of type Car and assign it to babyFactory.createCar(); here createCar() method is called on the object babyFactory, so the
//system first checks for createCar method on BabyToyFactory(as it is the one its instantiated with) and since it has that method
//it is executed and returns new BabyCar(); this new BabyCar() is assigned to bCar of type Car, and drive() method is called
//on bCar which is of type Car and instantiated with BabyCar(). System checks for drive() in BabyCar and executes it and
//prints "Baby Car is driving slowly..."