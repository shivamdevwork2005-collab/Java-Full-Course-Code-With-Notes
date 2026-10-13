public class Demo2 {
    public static void main(String[] args) {
        // Relational Operators. -> ==, !=, <, > , <=, >=
        int a = 10;
        int b = 10;

        boolean c = (a == b);
        System.out.println(c); // true

        boolean d = (a != b);
        System.out.println(d); // false

        boolean e = (a < b); // false
        boolean f = (a <= b); // true
        
        System.out.println(e);
        System.out.println(f);
    }
}
