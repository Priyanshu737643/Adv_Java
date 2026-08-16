// WAP to find the largest element
import java.util.*;

public class p2 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>(Arrays.asList(2, 1, 3, 4, 0));
        int large = li.stream().reduce(Integer.MIN_VALUE, (a, b) -> a>b ? a:b);
        System.out.println(large);
    }
}

