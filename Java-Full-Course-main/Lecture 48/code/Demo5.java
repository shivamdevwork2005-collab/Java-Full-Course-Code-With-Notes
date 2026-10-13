public class Demo5 {
    public static void main(String[] args) {
        // 1 to 100 (even numbers)
        Thread t1 = new Thread(() -> {
            for(int i=1; i<=100; i++) {
                if(i % 2 == 0) {
                    System.out.println("T1 : " + i);
                }
            }
        });


        // 1 to 100 (odd numbers)
        Thread t2 = new Thread(() -> {
            for(int i=1; i<=100; i++) {
                if(i % 2 != 0) {
                    System.out.println("T2 : " + i);
                }
            }
        });


        t1.start();
        t2.start();
    }
}

// Execution order --> Non determinism
