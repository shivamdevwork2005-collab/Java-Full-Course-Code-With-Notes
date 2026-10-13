public class Demo {
    public static void main(String[] args) {
        String s1 = "Hello"; // Literal
        String s2 = "Hello";

        System.out.println(s1 == s2); // true

        String s3 = new String("Aditya");  // using new operator
        String s4 = new String("Aditya");

        System.out.println(s3 == s4); // false

    }
}