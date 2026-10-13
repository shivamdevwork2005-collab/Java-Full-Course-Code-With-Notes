public class Demo2 {
    public static void main(String[] args) {
        // Function overloading

        int x = sum(2, 3);
        System.out.println(x);

        int y = sum(5, 6);
        System.out.println(y);

        int z = sum(3,5,6); // 14
        System.out.println(z);

        greet("Aditya", 28);
        greet(28, "Rohit");

        fun();

    }

    static int sum(int a, int b) {
        return (a + b);
    }

    static int sum(int a, int b, int c) { // different no. of parameters
        return (a + b + c);
    }

    static int sum(double a, double b) { // different types of parameters
        return (int)(a + b);
    }

    static void greet(String name, int age) {
        System.out.println("Hi " + name + ". Your age is " + age);
    }

    static void greet(int age, String name) { // ordering of parameters
        System.out.println("Hi " + name + ". Your age is " + age);
    }

    static void fun() {
        System.out.println("Hello");
    }

    static int fun2() {
        System.out.println("Hello");
        return 5;
    }
}
