// Local classes

public class Demo3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet();
    }
}

// Effective final variable

class Outer {
    void greet() {
        int y = 5;
        y++;

        class Local {
            void sayHello() {
                System.out.println(y);
            }
        }

        Local local  = new Local();
        local.sayHello();
    }
}

/*
Contructor
Method
If
Loop
Static block
*/
