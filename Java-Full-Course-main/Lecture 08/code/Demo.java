public class Demo {
    public static void main(String[] args) {        
        //int i = 1;
        // Comma seprated variation
        // for(int i = 1, j = 1; i <= 10 && j <= 5; i++, j+=2) {
        //     System.out.println(i * j);
        // }

        //boolean b = true;
        // for(int i=1; b == true; i++) {
        //     if(condition) {
        //         b = false;
        //     }
        // }

        // Integers -> byte, short, int, long

        // for(int i = 1; i <= 10; i++) {
        //     System.out.println(i);
        // }

        // Nested Loops
        // for(int i = 1; i<= 10; i++) {
        //    for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //    }
        //    System.out.println();
        // }

        /*
         i = 2
         * 
         * *
         * * * 
         * * * *
         * * * * *
         
        */

         // Jump Statements in Java
         // break, continue

        // boolean b = false;

        // for(int i = 1; i <= 10; i++) {
        //     System.out.println(i);

        //     if(b == true) {
        //         break;
        //     }
        // }

        // Whether a number is prime or not
        // int p = 9;

        // // 2, 3, 4, 5, .... 6, 7

        // int i;
        // for(i = 2; i < p; i++) {
        //     if(p % i == 0) {
        //         System.out.println("The number is not prime");
        //         break;
        //     }
        // }
        
        // if(i == p) {
        //     System.out.println("The number is prime");
        // }

        // for(int i=1; i<=10; i++) {

        //     if(i % 2 == 0) {
        //         continue;
        //     }

        //     System.out.println(i);
        // }

        // Break in nested loops
        // for(int i = 1; i<= 10; i++) {
        //    for(int j = 1; j <= i; j++) {
        //         System.out.print("* ");

        //         if(j >= 5) {
        //             continue;
        //         }
        //    }

        //    System.out.println();
        // }

        // Labels
        outer: for(int i = 1; i<= 10; i++) {
           inner: for(int j = 1; j <= i; j++) {
                System.out.print("* ");

                if(j >= 5) {
                    break outer;
                }
           }

        //    System.out.println();
        // }


        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        
        */

        // Code blocks
        // first: {
        //     second: {
        //         third: {
        //             System.out.println("Hello");
        //             break first;
        //         }
        //     }
        // }

        

    }
}