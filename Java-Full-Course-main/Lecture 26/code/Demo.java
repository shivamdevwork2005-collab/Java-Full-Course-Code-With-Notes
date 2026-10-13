public class Demo {
    public static void main(String[] args) {
        String s1 = new String();

        // String
        String s2 = new String("Hello");

        String s3 = "Aditya";
        String s4 = new String(s3);

        // char array
        char[] arr = {'A', 'd', 'i', 't', 'y', 'a', ' ', 'T', 'a', 'n', 'd', 'o', 'n'};
        String s5 = new String(arr); 
        //arr[0] = 'B';

       // System.out.println(s5);

        // char array subset
        String s6 = new String(arr, 0, 6);
       // System.out.println(s6);

        byte[] arr2 = {97, 98, 99};
        String s7 = new String(arr2, 0, 2);

        //System.out.println(s7);

        // StringBuilder / StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        String s8 = new String(sb);

        System.out.println(s8);
    }
}
