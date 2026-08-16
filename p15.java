// WAP to modify evry name's first character to uppercase
import java.util.*;

public class p15 {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("ramesh", "amit", "aditya", "sita", "ashoka", "sidharth");
        li.stream().map(n -> Character.toUpperCase(n.charAt(0)) + n.substring(1)).forEach(System.out::println);
    }
}
