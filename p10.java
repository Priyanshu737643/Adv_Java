// WAP to sort all elements in ascending order
// WAP to sort all elements in decending order

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class p10 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(10, 20, 30, 40, 50, 60);
        //* sort all elements in ascending order
        // li.stream().sorted().forEach(System.out::println);
        //* sort all elements in decending order
        li.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
