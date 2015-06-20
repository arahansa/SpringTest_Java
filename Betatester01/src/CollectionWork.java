import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionWork {
	public static void main(String[] args)
	{
		// equals() = true
		// Set - X
		// List - O
		// ==
//		List<A> s = new ArrayList<>();
//		s.add(new A("May"));
//		s.add(new A("Ara"));
//		System.out.println(s.size());
//		s.add(new A("May"));
//		s.add(new A("May"));
//		System.out.println(s.size());
//		
//		for(Object a : s) {
//			System.out.println(((A)a).name);
//		}
		
		//
		String[] x = new String[] { "A", "B", "C" };
		List<String> xc = Arrays.asList(x);
		List<String> xc2 = Arrays.asList(new String[] { "A", "B", "C" }); // varargs ...
		List<String> xc3 = Arrays.asList("A", "B", "C"); // varargs ...
		
		Object[] ac3 = xc3.toArray();
		String[] ac32 = xc.toArray(new String[xc.size()]);
		String[] ac33 = xc.toArray(new String[0]);
		
		A[] s = new A[] { new A("1"), new A("2"), new A("3") }; 
		
//		print(new String[] { "A", "B" });
	}

	private static void print(String... sa)
	{
		// TODO Auto-generated method stub
		
	}

	// nested
	static class A {
		String name;

		public A(String name) {
			super();
			this.name = name;
		}

		@Override
		public int hashCode()
		{
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj)
		{
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			A other = (A) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

	}

}
