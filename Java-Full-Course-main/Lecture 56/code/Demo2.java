import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo2 {
    public static void main(String[] args) {
        // Furture and Callable

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> f1 = executor.submit(() -> {
            try {
                Thread.sleep(3000);
            }
            catch(Exception e) {}

            return 10;
        });

        try {
            System.out.println(f1.get());
        }
        catch(Exception e) {}

    }
}
