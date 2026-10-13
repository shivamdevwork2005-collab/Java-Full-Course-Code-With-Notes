import java.util.function.*;
import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
       Function<Integer, Integer> square = x -> x * x;
 
       //System.out.println(square.apply(5));

       Consumer<Integer> print = x -> System.out.println(x);

       //print.accept(7);

       Supplier<Double> randomValue = () -> Math.random();

       // System.out.println(randomValue.get());

       Predicate<Integer> isEven = x -> x % 2 == 0;

       //System.out.println(isEven.test(7));

       List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,0));

        // for(Integer i : list) {
        //     System.out.println(i);
        // }

        list.forEach(System.out::println);

    }
}

// class Consume implements Consumer<Integer> {
//     @Override
//     public void accept(Integer x) {
//         System.out.println(x);
//     }
// }

