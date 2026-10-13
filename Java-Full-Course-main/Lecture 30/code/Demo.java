
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Collection<Integer> c = new TreeSet<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);

        Iterator<Integer> it =  c.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}

// Iterable

// 10 -> 20 -> 30 -> 40 -> 50
