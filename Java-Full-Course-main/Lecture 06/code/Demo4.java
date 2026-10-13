public class Demo4 {
    public static void main(String[] args) {
        // Logical Operators
       int a = 25;
       int b = 10;
       int c = 15;

       boolean d = (a < b) && (b < c);

       // Short circuit

       System.out.println(d); // false



        // Bitwise operators.
        int a = 2; // 00000000 00000000 00000000 00000010
        int b = 3; // 11
                  
        int c = a & b; // 10 --> 2
        int d = a | b; // 11 --> 3
        int e = a ^ b; // 01 --> 1
        int f = ~a; //  11111111 11111111 11111111 11111101 == -3

        //System.out.println(c + " , " + d + " , " + e + " , " + f);

        byte g = 1;
        //int h = (g << 8);  // 00000001 --> 1 00000000 --> 0

        int h = 1;
        h = h << 33;

        System.out.println(h); // 2

        byte i = 127; // 01000000 --> 00000000
        byte j = (byte) (i >> 8);

        // >>>

        //System.out.println(j); // 1
    }
}
