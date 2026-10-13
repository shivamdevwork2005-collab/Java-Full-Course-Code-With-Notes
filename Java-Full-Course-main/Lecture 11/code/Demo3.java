public class Demo3 {
    public static void main(String[] args) {
        // Chaining of functions

        fun1();

        System.out.println("bye");
    }

    static void fun1() {
        fun2();
        System.out.println("Hi");
    }

    static void fun2() {
        fun3();
        System.out.println("Hello");
    }

    static void fun3() {
        System.out.println("How are you");
    }

}
