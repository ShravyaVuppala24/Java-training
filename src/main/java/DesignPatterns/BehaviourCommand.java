package DesignPatterns;

import java.util.ArrayList;
import java.util.List;

// Command interface
interface Command {
    void execute();
}

// Receiver (Robot) class
class Robot {
    public void clean() {
        System.out.println("Robot is cleaning the house.");
    }

    public void cook() {
        System.out.println("Robot is cooking dinner.");
    }

    public void playMusic() {
        System.out.println("Robot is playing some music.");
    }
}

// Concrete Command classes
class CleanCommand implements Command {
    Robot robot;

    public CleanCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.clean();
    }
}

class CookCommand implements Command {
    Robot robot;

    public CookCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.cook();
    }
}

class PlayMusicCommand implements Command {
    Robot robot;

    public PlayMusicCommand(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void execute() {
        robot.playMusic();
    }
}

// Invoker class
class RemoteControl {
    private List<Command> commandQueue = new ArrayList<>();

    public void addCommand(Command command) {
        commandQueue.add(command);
    }

    public void executeCommands() {
        for (Command command : commandQueue) {
            command.execute();
        }
    }
}

// Client class
public class BehaviourCommand {
    public static void main(String[] args) {
        // Create a robot
        Robot r = new Robot();

        // Create command objects for different tasks
        Command clean = new CleanCommand(r);
        Command cook = new CookCommand(r);
        Command music = new PlayMusicCommand(r);

        // Create a remote control
        RemoteControl rc = new RemoteControl();

        // Add commands to the command queue
        rc.addCommand(clean);
        rc.addCommand(cook);
        rc.addCommand(music);

        // Execute the commands
        rc.executeCommands();
    }
}

//We bundle all the commands into one list and invoke it. Here we create an object called r of type Robot. Create object
//called clean,cook,music of type Command and instantiate with respective order class. Example cleanCommand is a class
//that takes robot object as parameter and implements command interface and overwrites the method execute()
//of that interface. We create another object called rc of type RemoteControl and call addCommand() method by passing
//command objects, this will add all commands into the list commandQueue in the RemoteControl Method, and we call
//executeCommands() method on rc, this will for every command object (clean, cook, music) within the commanQueue
//call execute() method, example, clean object is of type command but instantiated to cleanCommand class, so it
//invokes execute of cleanCommand and this execute() method will call robot.clean(), we need to remember that this clean
//object has taken r object as the parameter and this calls the clean() method of robot class