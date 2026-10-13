import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo3 {
    public static void main(String[] args) {
        //List<Integer> list = new ArrayList<>(List.of(1,14,11,9));
       List<String> list = new ArrayList<>(List.of("AA", "BBB", "CCCC", "DD", "EEE"));

        // Map<Boolean, List<Integer>> mp = list.stream()
        //                           .collect(Collectors.partitioningBy(x -> x % 2 == 0));

        // Map<Integer, List<String>> mp = list.stream()
        //                                     .collect(Collectors.groupingBy(
        //                                         x -> x.length(),
        //                                         Collectors.mapping(
        //                                             x -> x.toLowerCase(), Collectors.toList())));  

        String result = list.stream()
            .collect(Collectors.joining("-"));

        System.out.println(result);
    }
}

// toMap(), toSet(), toList()
// groupingBy() -> mapping()
// partitioningBy()
// joining()

