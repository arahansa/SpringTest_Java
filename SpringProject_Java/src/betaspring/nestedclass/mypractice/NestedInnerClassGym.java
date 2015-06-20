package betaspring.nestedclass.mypractice;

public class NestedInnerClassGym {

	public static void main(String[] args)
	{
		NestedInnerClassGym gym = new NestedInnerClassGym();
		NestedInnerClassGym.Person innerPerson = gym.new Person("헬스장원1");
		innerPerson.introduceMyself();
	}

	class Person {

		private int age;
		private String name;

		public Person(String name) {

			setAge((int) (Math.random() * 30));
			setName(name);
		}

		public void introduceMyself()
		{
			System.out.println("내 나이 :" + getAge() + ", 내 이름 :" + getName());
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

	}

}
