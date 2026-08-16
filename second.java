import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class second {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(20);
        li.add(30);
        li.add(1,40);
        li.add(2, 50);
        System.out.println(li.get(2)); // 50
        li.remove(0);
        System.out.println(li.contains(20)); // false
        System.out.println(li.isEmpty());  // false
        System.out.println(li); // list
        
        // print by using loop
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }

        // by using foreach loop (by default from 0 to end)
        for (Integer i : li) {
            System.out.println(i);
        }

        // Iterator
        Iterator it = li.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // by using lambda expression
        li.forEach(n -> System.out.println(n));
        

        ArrayList<Integer> li2 = new ArrayList<>(Arrays.asList(20, 10, 30, 55, 40));

        // Stream

        // 1. Builder Pattern : updating the obj multiple times
        // 2. Method Chaining : same method written multiple times in single line

        // Operations on Stream

        // 1. Intermediate Operation
        // 2. Terminal Operation

        li2.stream().filter(n -> n >= 40).forEach(System.out::println);
        long c = li2.stream().filter(n -> n >= 30).filter(n -> n % 2 == 0).count();
        System.out.println(c);

        List<Integer> result = li2.stream().filter(n -> n >= 30).filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(result);
    }
}


