import java.util.*;
import java.util.stream.*;
class first
{
	public static void main(String arg[])
	{
		ArrayList<Integer> li = new ArrayList<>(Arrays.asList(20, 10, 30, 55, 40, 20, 10));

		//how to convert this to stream
		li.stream().filter(n->n>=30).filter(n->n%2==0).forEach(System.out::println);

		long c=li.stream().filter(n->n>=30).filter(n->n%2==0).count();
		System.out.println(c);

		List<Integer> result=li.stream().filter(n->n>=30).filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(result);
        
        li.stream().distinct().forEach(System.out::println);
	}
}

