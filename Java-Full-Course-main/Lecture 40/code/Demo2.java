import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        // Terminal Operations

        List<Integer> list = new ArrayList<>(List.of(1,13,11,9));

        // Set<Integer> set = list.stream()
        //     .map(x -> x + 1)
        //     .collect(Collectors.toSet());


        // System.out.println(set);

        // int sum = list.stream()
        //     .reduce(1, (a,b) -> a + b);

        // System.out.println(sum);

        OptionalDouble avg = list.stream()
            .filter(x -> x > 10)
            .mapToInt(x -> x)
            .average();

        System.out.println(avg.getAsDouble());


    }
}

// forEach(), forEachOrdered()
// toList()
// collect() --> Collector
// reduce() --> combine stream elements into single value
// count()
// findFirst() --> short circuting
// findAny()
// anyMatch() , allMatch(), noneMatch()
// sum(), average(), max(), min() --> primitive streams

