// WAP to calculate the sum of square of all the even numbers
import java.util.*;

public class p12 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>(Arrays.asList(2, 5, 3, 6, 7, 4, 9));
        // int res = li.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum();
        int res = li.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(0, (a, b) -> a + b);
        System.out.println(res);
    }
}
