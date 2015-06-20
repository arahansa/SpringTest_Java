package betaspring.nestedclass.mypractice;

public class NestedStaticGym {
	private static int numTotalGym;
	private String nameGym;

	static class Person {
		private int age;
		private String name;
		private NestedStaticGym hisGym;

		public void introduceMyself()
		{
			String msg = "안녕하세요 제 나이는 " + getAge() + "살이고, " + "제가 다니는 PC방은 "
					+ getHisGym().getNameGym() + "이고, 이 동네 피씨방수는 :"
					+ getNumTotalGym() + "개입니다.";
			System.out.println(msg);
		}

		public Person() {
			setAge((int) (Math.random() * 30));
		}

		public int getAge()
		{
			return age;
		}

		public void setAge(int age)
		{
			this.age = age;
		}

		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public NestedStaticGym getHisGym()
		{
			return hisGym;
		}

		public void setHisGym(NestedStaticGym hisGym)
		{
			this.hisGym = hisGym;
		}

	}

	public static void main(String[] args)
	{
		NestedStaticGym nsGym1 = new NestedStaticGym();
		nsGym1.setNameGym("우리앞집 헬스장");
		NestedStaticGym nsGym2 = new NestedStaticGym();
		nsGym2.setNameGym("옆집 헬스장");

		NestedStaticGym.Person person1 = new NestedStaticGym.Person();
		Person person2 = new Person();

		System.out.println(person1);
		System.out.println(person2);

		person1.setHisGym(nsGym1);
		person2.setHisGym(nsGym2);

		person1.introduceMyself();
		person2.introduceMyself();
	}

	public NestedStaticGym() {
		numTotalGym++;
	}

	public static int getNumTotalGym()
	{
		return numTotalGym;
	}

	public static void setNumTotalGym(int numTotalGym)
	{
		NestedStaticGym.numTotalGym = numTotalGym;
	}

	public String getNameGym()
	{
		return nameGym;
	}

	public void setNameGym(String nameGym)
	{
		this.nameGym = nameGym;
	}

}
