// WAP to add all the elements present in a list
import java.util.*;

public class p1 {
    public static void main(String[] args) {
        // List<Integer> li = Arrays.asList(2,1,3,4);
        ArrayList<Integer> li = new ArrayList<>(Arrays.asList(2, 1, 3, 4));
        
        int sum = li.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
