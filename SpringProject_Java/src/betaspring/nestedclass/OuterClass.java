package betaspring.nestedclass;

public class OuterClass {

	private String 참조될변수 = "참조될 변수";

	class InnerClass {
		public void hello()
		{
			System.out.print("inner : ");
			System.out.println(참조될변수);
		}
	}

	static class StaticNestedClass {
		public void hello()
		{
			System.out.println("static nested class");
			// System.out.println(참조될변수); //Error!
		}
	}

	public static void main(String[] args)
	{
		// inner 클래스의 선언
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass innerObject = outer.new InnerClass();
		innerObject.hello();

		// nested static 클래스의 선언
		OuterClass.StaticNestedClass nestedStatic = new OuterClass.StaticNestedClass();
		nestedStatic.hello();

	}
}
