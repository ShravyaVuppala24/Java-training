package ThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a ThreadPoolExecutor with 2 core threads, 4 maximum threads, and a keep-alive time of 10 seconds
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        // Submit tasks for execution
        for (int i = 1; i <= 2; i++) {
            Task task = new Task("Task " + i);
            System.out.println("Submitting: " + task.name);
            executor.execute(task);
        }

        // Shutdown the executor
        executor.shutdown();

    }
}

