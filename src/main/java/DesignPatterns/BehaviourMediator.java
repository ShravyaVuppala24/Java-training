package DesignPatterns;

import java.util.ArrayList;
import java.util.List;

// Mediator interface
interface Mediator {
    void sendMessage(String message, Colleague colleague);
}

// Colleague interface
interface Colleague {
    void sendMessage(String message);
    void receiveMessage(String message);
}

// Concrete mediator
class ConcreteMediator implements Mediator {
    List<Colleague> colleagues;

    public ConcreteMediator() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {
        for (Colleague col : colleagues) {
            if (col != colleague) {
                col.receiveMessage(message);
            }
        }
    }
}

// Concrete colleague
class ConcreteColleague implements Colleague {
    private Mediator mediator;
    private String name;

    public ConcreteColleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }
}

public class BehaviourMediator {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague colleague1 = new ConcreteColleague("Colleague 1", mediator);
        ConcreteColleague colleague2 = new ConcreteColleague("Colleague 2", mediator);
        ConcreteColleague colleague3 = new ConcreteColleague("Colleague 3", mediator);

        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);
        mediator.addColleague(colleague3);

        colleague1.sendMessage("Hello everyone!");
    }
}

