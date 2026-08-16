// WAP to partition the elements by even and odd

import java.util.*;
import java.util.stream.Collectors;

public class p17 {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(10, 11, 13, 12, 14, 17);
        // Map<Boolean, List<Integer>> result = li.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        Map<String, List<Integer>> result = li.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd"));
        System.out.println(result);
    }
} 
