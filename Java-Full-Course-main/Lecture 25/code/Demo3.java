public class Demo3 {
    public static void main(String[] args) {
        String s = "";

        for(int i=0; i<5; i++) {
            s += i; // s = s + i;
            System.out.println(s);
        }
    }
}

// Problem of Immutability
// "0" -> "01" --> "012" -> "0123" -> "01234"