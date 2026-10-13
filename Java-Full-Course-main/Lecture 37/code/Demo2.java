public class Demo2 {
    public static void main(String[] args) {

        Calculate c1 = (a,b) -> a + b;

        System.out.println();
    }

    public void print(Calculate c1) {
        System.out.println();
    }
}


interface Calculate {
    int sum(int a, int b);
}