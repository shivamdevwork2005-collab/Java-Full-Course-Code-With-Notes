// Final Keyword

public class Demo4 {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.PI);

        final int x;
        x = 4;
        System.out.println(x);
    }
}

//why main is static in java ??
// Demo4 d1 = new Demo4();
// d1.main()
// Demo4.main()

class Random {
    static final double PI;

    static {
        PI = 3.14;
    }
}
