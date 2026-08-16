// WAP to check whether any negative number is present in the list or not
import java.util.*;

public class p8 {
    public static void main(String[] args) {
        // anyMatch()  -   return type boolean -  terminal operation
        // allMatch()  -  if all the elem match the condtion .....
        List<Integer> li = Arrays.asList(10, 20, -30, 40);
        boolean ans = li.stream().anyMatch(n -> n < 0);
        boolean ans2 = li.stream().allMatch(n -> n%2 == 0);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
