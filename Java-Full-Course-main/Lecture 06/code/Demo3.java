public class Demo3 {
    public static void main(String[] args) {
       // Bitwise operations
       int a = 2; // 10 --> 00000000 00000000 00000000 00000010
       int b = 3; // 11 --> 00000000 00000000 00000000 00000011
       int c = a & b; // 10 --> 2
       int d = a | b; // 11 --> 3
       int e = a ^ b; // 01 --> 1
       int f = ~a; // 11111111 11111111 11111111 11111101 --> -3

       System.out.println(c + " , " + d + " , " + e + " , " + f);

       // Shift operations
       int g = 1; //   00000000 00000000 00000000 00000001 --> 1
       g = g << 33; // g = g << 33 == g << 1 

       // Right shift (>>) (>>>) 
       byte h = 1; // 00000001
       h = (byte)(h << 1); // 00000010 --> 2

       System.out.println(g);
        System.out.println(h);

    }
}
