public class Demo2 {
    public static void main(String[] args) {
        //MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(() -> System.out.println("Thread is Running"));

        t1.start();


    }
}

// Thread using Runnable Interface

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is runnning");
    }
}
