// WAP to find the first element

import java.util.*;

public class p6 {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>(Arrays.asList(20, 12, 13, 14, 56, 63));
        // findFirst()  -  terminal operation   -  return type OptionalList
        Optional<Integer> res = li.stream().findFirst();
        System.out.println(res);  // Optional[20]
        System.out.println(res.get());  // 20
        
        // Optional<Integer> res2 = li.stream().filter(n -> n >=70).findFirst();
        // System.out.println(res2.get());  //* error if res elem not available
        // System.out.println(res2);  //* Optional.empty

        //* solution  -  use orElse()
        int res3 = li.stream().filter(n -> n >= 70).findFirst().orElse(0);
        System.out.println(res3);  //* 0
        
    }
}
