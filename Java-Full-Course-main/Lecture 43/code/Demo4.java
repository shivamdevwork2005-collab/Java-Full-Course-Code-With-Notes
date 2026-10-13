public class Demo4 {
    public static void main(String[] args) {
        // Exception handling in chain of methods

        System.out.println("Step 1");

        methodA(5, 0);

    }
    private static void methodA(int a, int b) {
        methodB(a,b);
    }
    private static void methodB(int a, int b) {
        try {
            System.out.println(a / b); // illegal --> new ArithmeticException("/ by zero");
        }
        catch(ArithmeticException e) {
            System.out.println("Divide by zero is not allowed");
        }
        

        System.out.println("Step 2");
    }
}

// main() -> methodA() -> methodB()

/*
Step 1
Divide by zero is not allowed
Step 2
*/