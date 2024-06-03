package DesignPatterns;

// Complex subsystem 1
class Subsystem1 {
    public void operation1() {
        System.out.println("Subsystem 1: Performing operation 1");
    }
}
// Complex subsystem 2
class Subsystem2 {
    public void operation2() {
        System.out.println("Subsystem 2: Performing operation 2");
    }
}
// Facade class providing a simplified interface
class Facade {
     Subsystem1 s1;
     Subsystem2 s2;

    public Facade() {
        this.s1 = new Subsystem1();
        this.s2 = new Subsystem2();
    }

    // Simplified method to perform a series of operations
    public void performOperations() {
        System.out.println("Facade: Starting operations");
        s1.operation1();
        s2.operation2();
        System.out.println("Facade: Operations completed");
    }
}

// Main class to demonstrate the usage of the Facade pattern
public class StructureFacade {
    public static void main(String[] args) {
        // Create a facade object
        Facade facade = new Facade();

        // Use the facade to perform operations
        facade.performOperations();
    }
}

//Created a facade class, which declare variables of other class types, and created objects of respective types
//and assigns it to those variables accordingly and creates a method which performs all the operations of the classes
//in the main class, we just create an object of facade type and run the method in the facade class to execute all
//operations present in the other classes