public class Demo {
    public static void main(String[] args) {
        // Sleep()
        System.out.println("Main thread starts");

        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {}

        System.out.println("Main thread ends");
    }
}

// Thread important methods
/*
 Thread.sleep(milliseconds) -> TIMED_WAITING
 RUNNABLE --> TIMED_WAITING --> RUNNABLE
*/

