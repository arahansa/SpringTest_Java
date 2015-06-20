package betaspring.nestedclass.mypractice;

public class InnerRunner {
	public static void main(String[] args)
	{
		NestedInnerClassGym gym = new NestedInnerClassGym();
		NestedInnerClassGym.Person innerPerson = gym.new Person("헬스장원1");
		innerPerson.introduceMyself();
		NestedInnerClassGym.Person innerPerson2 = gym.new Person("헬스장원2");
		innerPerson2.introduceMyself();
	}
}
