public class Demo {
    public static void main(String[] args) { 
        // Funtions in Java

        greet();

        sayHello("Rohit");  // Arguments

        System.out.println(getNumber());

        System.out.println(multiply(2, 4)); // 8

        return; // optional
    }

    // NO Ip, No op
    static void greet() {
        System.out.println("Hello");
        return;
    }

    // IP. No OP
    static void sayHello(String name) { // Number of parmeters can be anything
        System.out.println("Hello " + name);
    }

    // No ip, OP
    static int getNumber() {
        return 10;
    }

    // IP, OP
    static int multiply(int a, int b) {
        return (a * b);
    }
}
