// WAP to find the avg
import java.util.*;

public class p3 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 2));
        int sum = li.stream().reduce(0, (a, b) -> a + b);
        int size = li.size();
        double result = sum / size;
        System.out.println(result);
    }
}
