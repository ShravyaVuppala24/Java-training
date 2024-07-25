package SyncStatic;

public class Calculator {
    private static int total = 0;

    // Synchronized static method to ensure thread safety
    public static synchronized void add(int number) {
        total += number;
        System.out.println("Added " + number + ", Total: " + total);
    }

    public static synchronized int getTotal() {
        return total;
    }
}

