public class Demo {
    public static void main(String[] args) {
        // Inner try handle its own exception
        try {
            System.out.println("Outer try starts");
            try {
                System.out.println("Inner try starts");

                System.out.println(5 / 0); // new ArithmeticException("/ by zero");

                System.out.println("Inner try ends");
            }
            catch(ArithmeticException e) {
                System.out.println("divide by zero is not allowed : Inner");
            }
            System.out.println("Outer try ends");
        }
        catch(ArithmeticException e) {
            System.out.println("Divide by zero not allowed : Outer");
        }
    }
}

/*
Outer try starts
Inner try starts
divide by zero is not allowed : Inner
Outer try ends
*/
