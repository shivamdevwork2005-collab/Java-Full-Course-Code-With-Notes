import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) {
        // Executor Framework

        ExecutorService executor = Executors.newFixedThreadPool(2);

        // number of task = 5
        for(int i = 1; i<=5; i++) {

            int taskId = i;

            executor.execute(() -> {
                System.out.println("Task " + taskId + " is perfromed by " + 
                    Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}
