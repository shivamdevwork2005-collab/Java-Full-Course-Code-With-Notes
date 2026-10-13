import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        //System.out.println(list.get(1));

        //list.set(1, 5);

        //list.addAll(0, List.of(9,8,7));

        //System.out.println(list);

        //list.remove(0);

        //System.out.println(list);

        list.indexOf(2);
        list.lastIndexOf(5);

        // ListIterator<Integer> it = list.listIterator(3);

        // while(it.hasPrevious()) {
        //     System.out.println(it.previousIndex());
        //     it.previous();
        // }

        List<Integer> l = List.of(1,2,3,4,5,6,7,8);
        //l.add(9);

        List<Integer> l2 = List.copyOf(l);
        l2.add(7);

        System.out.println(l2);

    }
}

// 1, 2, 3 
