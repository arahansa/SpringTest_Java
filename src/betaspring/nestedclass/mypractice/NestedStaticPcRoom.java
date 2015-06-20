package betaspring.nestedclass.mypractice;

public class NestedStaticPcRoom {
	private static int numTotalPcroom;
	private String namePcroom;

	static class Person {
		private int age;
		private String name;

		public Person() {
			setAge((int) (Math.random() * 30));
		}

		public void introduceMyself()
		{
			String msg = "안녕하세요 제 나이는 " + getAge() + "살이고, " + "제가 다니는 PC방은 "
					+ getHisPcRoom().getNamePcroom() + "이고, 이 동네 피씨방수는 :"
					+ getNumTotalPcroom() + "개입니다.";
			System.out.println(msg);
		}

		private NestedStaticPcRoom hisPcRoom;

		public NestedStaticPcRoom getHisPcRoom()
		{
			return hisPcRoom;
		}

		public void setHisPcRoom(NestedStaticPcRoom hisPcRoom)
		{
			this.hisPcRoom = hisPcRoom;
		}

		public int getNumTotalPcroom()
		{
			return numTotalPcroom;
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

	public static void main(String[] args)
	{
		NestedStaticPcRoom nsPcroom = new NestedStaticPcRoom();
		nsPcroom.setNamePcroom("우리집피씨방");
		NestedStaticPcRoom nsPcroom2 = new NestedStaticPcRoom();
		nsPcroom2.setNamePcroom("옆집피씨방");

		NestedStaticPcRoom.Person person1 = new NestedStaticPcRoom.Person();
		Person person2 = new Person();
		System.out.println(person1); // 주소 출력
		System.out.println(person2);

		person1.setHisPcRoom(nsPcroom);
		person2.setHisPcRoom(nsPcroom2);
		person1.introduceMyself();
		person2.introduceMyself();
	}

	public NestedStaticPcRoom() {
		numTotalPcroom++;
	}

	public String getNamePcroom()
	{
		return namePcroom;
	}

	public void setNamePcroom(String namePcroom)
	{
		this.namePcroom = namePcroom;
	}

}
