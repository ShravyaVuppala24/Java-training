package DesignPatterns;

// Legacy interface representing a shape with a method to calculate area
interface LegacyShape {
    double calculateArea();
}

// Legacy class representing a circle
class Circle implements LegacyShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// New class representing a square
class Square {
    private double side; //Why are we taking private here ?

    public Square(double side) {
        this.side = side;
    }


    public double calculateAreaOfSquare() {
        return side * side;
    }
}

// Adapter class to adapt Square to LegacyShape interface
class SquareAdapter implements LegacyShape {
    private Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public double calculateArea() {
        // Use the method from SquareShape interface to calculate area of square
        return square.calculateAreaOfSquare();
    }
}

// Client code using the legacy system
public class StructureAdapter {
    public static void main(String[] args) {
        // Create a circle with radius 5
        LegacyShape circle = new Circle(5);
        System.out.println("Area of circle: " + circle.calculateArea()); // Output: Area of circle: 78.53981633974483


        // Adapt the square to fit into the legacy system
        LegacyShape s1 = new SquareAdapter(new Square(4));
        System.out.println("Area of square: " + s1.calculateArea()); // Output: Area of square: 16.0
    }
}

//s1 object if type LegacyShape is created and instantiated with SquareAdapter, which takes a parameter of Square type
// which again takes a parameter of size, calculateArea() is called upon s1, system checks for this method in
//SquareAdapter, finds one and executes it, this returns square.calculateAreaOfSquare(); and this returns side*side
//that is present in the method calculateAreaOfSquare() of square class