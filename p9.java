// WAP to print the first 3 elements
// WAP to skip the first 3 elements
import java.util.*;

public class p9 {
    public static void main(String[] args) {
        // limit()
        // skip()
        List<Integer> li = Arrays.asList(10, 20, 30, 40, 50, 60);
        // li.stream().limit(3).forEach(System.out::println);  // 10 20 30
        li.stream().skip(3).forEach(System.out::println);  // 40 50 60
    }
}
