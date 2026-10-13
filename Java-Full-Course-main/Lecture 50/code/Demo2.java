public class Demo2 {
    
    static volatile boolean flag = false; // true

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {}
            flag = true; // cache --> flag = true
        });

        Thread t2 = new Thread(() -> { // cache --> flag = false
            while(!flag) {
                // System.out.println("Thread 2 Running..."); // synchronized
                // do nothing
            }
            System.out.println("Thread 2 finished");
        });

        t1.start();
        t2.start();
    }
}


