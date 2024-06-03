package DesignPatterns;

import java.util.ArrayList;
import java.util.List;

// Subject (or Observable) interface
interface Subject {
    void registerObserver(Observer observer);
    void notifyObservers();
}

// Concrete Subject
class Cake implements Subject {
    List<Observer> observers = new ArrayList<>();

    public void cutSlice() {
        System.out.println("Someone took a slice of cake!");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }
}

// Observer interface
interface Observer {
    void update();
}

// Concrete Observer
class Friend implements Observer {
     String name;

    public Friend(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + ": Yay! Let's eat cake!");
    }
}

// Main class
public class BehvariourObserver {
    public static void main(String[] args) {
        // Create a cake
        Cake c = new Cake();

        // Create some friends
        Friend friend1 = new Friend("Alice");
        Friend friend2 = new Friend("Bob");

        // Register friends as observers of the cake
        c.registerObserver(friend1);
        c.registerObserver(friend2);

        // Someone cuts a slice of cake
        c.cutSlice();
    }
}

//Here we create an interface called Subject which lists out all the tasks can be performed within another class called
//cake, in the main class we create an object of cake and assign it to c, create objects of friends as well, friends is
//another class that implements Observer interface which defines what should the objects do when a method is triggered
// friends class will create objects for the observer list and registerObserver method present in the cake class will
//add these friends object to the observer list, and cutSlice() method of cake class is called upon c object which will
// call notifyObservers() method of cake class, and this method will call method update() on friends class for each
//object in the list of observer