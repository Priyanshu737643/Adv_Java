// WAP to convert stream back to ArrayList
import java.util.*;
import java.util.stream.Collectors;

public class p4 {
    public static void main(String[] args) {
    ArrayList<Integer> li = new ArrayList<>(Arrays.asList(20, 12, 13, 14, 56, 63));

    // List<Integer> res = li.stream().filter(n -> n >= 20).collect(Collectors.toList()); //* return a - List

    ArrayList<Integer> res = li.stream().filter(n -> n >= 20).collect(Collectors.toCollection(ArrayList::new));  //* return a - ArrayList

    System.out.println(res);
    }
}
