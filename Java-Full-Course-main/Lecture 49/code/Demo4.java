public class Demo4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            while(!Thread.currentThread().interrupted()) {
                System.out.println("Running");
            }
        });

        t1.start();

        Thread.sleep(2000);

        t1.interrupt();
    }
}

/*
    Thread --> interrupt flag (default true) 

    t1.interrupt() --> Sends a signal to t1 thread that it shoult stop doing what its doing.

    We can gracefully handle
    --> You can make a thread run until a condition
    --> Cancelling a long running task
    --> usesd to stop Thread pool 

    isInterrupted() --> return interrupt flag value (T/F)
    interrupted() --> return interrupt flag value (T/F) but also set it back to false

    -> sleep(), join(), wait() : TIMED_WAITING, WAITING --> interrupt()



*/
