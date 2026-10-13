public class Demo4 {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> Counter.increment());

        Thread t2 = new Thread(() -> Counter.increment());

        t1.start();
        t2.start();
    }
}

// Static Synchronization

class Counter {

    static int count = 0;

    static void increment() {
        synchronized(Counter.class) {
            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {}

            count++;
            System.out.println(count);
        }
    }
}

