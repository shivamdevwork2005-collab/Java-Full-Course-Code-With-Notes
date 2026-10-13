public class Demo2 {
    public static void main(String[] args) {
        // Switch statements
        int i = 1;

        switch(i) { // switch(expression) --> byte, short, int, char, Enumeration
            case 1: 
                System.out.println("i is 1");
                break;
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
                System.out.println("i is 3");
                break;
            default:
                System.out.println("i is greater then 3");
                break;
        }

        // switch --> limited use case -> should evaluate to byte, short, int, char, Enumeration.
        // No duplicate cases allowed.
        // After JDK7 Strings can also be used as switch expression. 
        // After JDK-14 switch is enhanced too much.

        int j = 5;
        int k = 1;
        switch(j) {
            case 4:
                System.out.println("j is 4");
                break;
            case 5:
                switch(k) {
                    case 1:
                        switch(j) {

                        }
                    case 2:
                        break;
                }
            default:
                System.out.println("j is not 4 && 5");
                break;
        }
    }

    // selection statements
}
