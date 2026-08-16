// WAP to find out the second largest element from a list
import java.util.*;

public class p11 {
    // 1. sort in desc order
    // 2. skip first (largest)
    // 3. findFirst (second largest)
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(20, 30, 60, 40, 50, 10);
        int res = li.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
        System.out.println(res);  // 50
    }
}
