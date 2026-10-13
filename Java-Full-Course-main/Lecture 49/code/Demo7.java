public class Demo7 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Custom thread running");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Custom-2 thread running");
        });

        t1.start();
        t2.start();
        t1.setPriority(10);

        System.out.println(t1.getPriority());
    }
}

/*
    Thread Priority
    MAX_PRIORITY = 10
    MIN_PRIORITY = 1
    NORM_PRIORITY = 5

    Depends on OS 
    -> may respect Priority
    -> may partially repsect
    -> may not at all

*/