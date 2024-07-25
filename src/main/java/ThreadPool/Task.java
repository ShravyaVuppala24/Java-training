
package ThreadPool;

public class Task implements Runnable {
    String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Executing : " + name + ", Current Thread : " + Thread.currentThread().getName());
        try {
            // Simulate some work with sleep
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed : " + name + ", Current Thread : " + Thread.currentThread().getName());
    }
}

