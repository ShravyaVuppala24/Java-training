package SyncStatic;

public class CalcThread extends Thread {
    private int number;

    public CalcThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        Calculator.add(number);
    }

    public static void main(String[] args) {
        Thread t1 = new CalcThread(5);
        Thread t2 = new CalcThread(10);
        Thread t3 = new CalcThread(15);

        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final total
        System.out.println("Final Total: " + Calculator.getTotal());
    }
}

