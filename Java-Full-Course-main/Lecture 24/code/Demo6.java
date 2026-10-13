public class Demo6 {
    public static void main(String[] args) {
        D d = new D();
        d.fun();
    }
}

// Diamond problem solved by interfaces

interface A {
    void fun();
}

interface B extends A {
    default void fun() {
        System.out.println("B");
    }
}

interface C extends A {
    default void fun() {
         System.out.println("C");
    }
}

class D implements B, C {
    @Override
    public void fun() {
        System.out.println("D");
    }
}
