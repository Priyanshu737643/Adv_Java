// WAP to find the names starts with "A" , convert it to uppercase and sort
import java.util.*;

public class p13 {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("Muna", "Amit", "Abhi", "sita", "Ashok");
        li.stream().filter(n -> n.startsWith("A")).map(n -> n.toUpperCase()).sorted().forEach(System.out::println);
    }
}
