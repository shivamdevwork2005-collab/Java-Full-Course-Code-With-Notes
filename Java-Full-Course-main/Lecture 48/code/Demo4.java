public class Demo4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Current thread is " + Thread.currentThread().getName());
        });

        t1.start();
        t1.start();
        //t1.run();
    }
}

// start() or run()

// Can we start() the same thread twice ? --> NO
