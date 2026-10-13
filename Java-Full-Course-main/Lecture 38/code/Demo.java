public class Demo {
    public static void main(String[] args) {
        Calculator c = (a,b) -> a + b;
        
        print(5,4, c);

    }

    public static void print(int a, int b, Calculator c) {
        System.out.println(c.calculate(a, b));
    }
}

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

// class Addition implements Calculator {
//     @Override
//     public int calculate(int a, int b) {
//         return a + b;
//     }
// }