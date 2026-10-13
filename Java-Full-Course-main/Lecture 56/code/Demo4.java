import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo4 {
   public static void main(String[] args) {
        ThreadPoolExecutor executor = 
        new ThreadPoolExecutor(2, 
                              5,
                              10 ,
                              TimeUnit.SECONDS, 
                              new ArrayBlockingQueue<>(2));

        // ExecutorService executor2 = Executors.newFixedThreadPool(2);

        
        for(int i = 1; i<=5; i++) {
            int taskId = i;

            executor.execute(() -> {
                System.out.println("Task " + taskId + " is perfromed by " +
                    Thread.currentThread().getName()
                );

                try {
                    Thread.sleep(2000);
                }
                catch(Exception e) {}
            });
        }

        executor.shutdown();
   } 
}
