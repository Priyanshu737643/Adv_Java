// WAP to count the names having more than 5 characters
import java.util.*;

public class p14 {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("Ramesh", "Amit", "Aditya", "sita", "Ashoka", "Sidharth");
        long len = li.stream().filter(n -> n.length() > 5).count();
        System.out.println(len);
    }
}
