public class Demo {
    public static void main(String[] args) {
        //1. Implicit conversion 
        // (byte to int)
        // byte b = 24;
        // int i;

        // i = b;
        // System.out.println(i); // 24

        // character to int
        // char c = 'a';
        // int i;

        // i = c;

        // System.out.println(i); // 97

        // 2. Explicit conversion
        // int i = 300;
        // byte b; // -128 to +127

        // b = (byte) i;
        // System.out.println(b); // 300 % 256 = 44

        // 3. Truncating conversion
        // float f = 15.678f;
        // int i;

        // i = (int) f;
        // System.out.println(i); // 15

        // Boolean to any data type
        // These conversions are not possible

        // boolean bool = false;
        // int i;

        // i = bool;
        
        byte b = 50;
        b = (byte) (b * 2); // 100

        System.out.println(b);
    }
}
