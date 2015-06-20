import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;


public class Collection2 {
	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<>(); 
		for(int i=1;i<=100;i++) l.add(i);
		
		// anonymous class
		BinaryOperator<Integer> bo = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer x, Integer y)
			{
				return x + y;
			}			
		};
		System.out.println(l.parallelStream().reduce(0, bo));    
		
		// lambda expression
		System.out.println(l.parallelStream().reduce(0, (Integer x, Integer y) -> {
			return x + y;
		}));
		
		System.out.println(l.parallelStream().reduce(0, (x, y) -> x + y ));

//		Sum s = new Sum();
//		l.parallelStream().forEach(x -> s.sum += x);
//		System.out.println(s.sum);
	}
	
	static class Sum {
		int sum;
	}
}
