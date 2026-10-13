// Scanner class

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        String name = sc.nextLine();

        System.out.println("age = " + age);
        System.out.println("Name = " + name);
    }
}
