import java.util.function.*;

public class Demo3 {
    public static void main(String[] args) {

        // (x + 2) * 3 --> x+2, x*3 

        Function<Integer, Integer> equation = x -> ((x+2) * 3);
        
        Function<Integer, Integer> add2 = x -> x + 2; // f(x)
        Function<Integer, Integer> multiply3 = x -> x * 3; // g(x)
        Function<Integer, Integer> divide2 = x -> x / 2; // g(x)

        int ans = multiply3.apply(add2.apply(2));
 
        //int ans2 = add2.andThen(multiply3).apply(2);

        Function<Integer, Integer> ansFunc = add2.andThen(multiply3);
        int ans3 = ansFunc.apply(2);

        System.out.println(ans3);

    }
}
