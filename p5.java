// WAP to add all the elements in a list

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;

public class p5 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>(Arrays.asList(20, 12, 13, 14, 56, 63));
        //* with reduce         -      (reduce is a terminal operation)
        // int sum = li.stream().reduce(0, (a, b) -> a + b);
        // System.out.println(sum);
        //* without reduce
        // int sum2 = li.stream().mapToInt(n -> n).sum();
        // System.out.println(sum2);

        //* find largest element using reduce
        int max = li.stream().reduce(Integer.MIN_VALUE, (a, b) -> a>b ? a:b);
        System.out.println(max);

        //* find largest element without using reduce
        // max() - return OptionalInt  (not normal int)
        // OptionalInt max2 = li.stream().mapToInt(n -> n).max();
        int max2 = li.stream().mapToInt(n -> n).max().orElse(0);
        System.out.println(max2);

        //* NOTE
        // max , min, avg - terminal operation and optional int or double
        // with normal int/double - can use orElese()
        // count()  - return long
        // findFirst()   -  returns a Optional List
    }
}
