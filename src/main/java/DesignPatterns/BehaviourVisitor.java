package DesignPatterns;

interface AnimalVisitor {
    void visit(Lion lion);
    void visit(Elephant elephant);
}

// Concrete visitor
class AnimalFeeder implements AnimalVisitor {
    @Override
    public void visit(Lion lion) {
        System.out.println("Feeding meat to the lion.");
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Feeding hay to the elephant.");
    }
}

// Element interface
interface Animal {
    void accept(AnimalVisitor visitor);
}

// Concrete elements
class Lion implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}

class Elephant implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}

// Client code
public class BehaviourVisitor {
    public static void main(String[] args) {
        // Create animals
        Animal lion = new Lion();
        Animal elephant = new Elephant();

        // Create a visitor
        AnimalVisitor feeder = new AnimalFeeder();

        // Animals accept the visitor
        lion.accept(feeder); // Feeding meat to the lion.
        elephant.accept(feeder); // Feeding hay to the elephant.
    }
}
