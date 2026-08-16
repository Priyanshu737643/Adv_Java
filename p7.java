// WAP to find the first name that starts with 'A'

import java.util.ArrayList;
import java.util.Arrays;

public class p7 {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>(Arrays.asList("Rohit", "Amit", "Ashok", "Sahil"));
        String name = li.stream().filter(n -> n.startsWith("A")).findFirst().orElse("No Name");
        System.out.println(name);
    }
}
