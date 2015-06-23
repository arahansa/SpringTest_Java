package betaspring.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by arahansa on 15. 6. 22.
 */
public class Maps {
	
	public static void main(String[] args)
	{
		Map<Integer, String> numChiken= new HashMap<>();
		numChiken.put(001, "교촌");
		numChiken.put(002, "교촌");
		numChiken.put(003, "네네");
		// 같은 키 넘버로 넣으면 없어진다.
		numChiken.put(001, "호식이두마리");
		System.out.println("나의 치킨넘버 :"+numChiken);
		
		// TreeMap은 Set에서 hashset과 TreeSet을 기억하자. 
		Map<Integer, String> numChickenTree= new TreeMap<>();
		numChickenTree.put(001, "교촌");
		numChickenTree.put(002, "교촌");
		numChickenTree.put(003, "네네");
		System.out.println("나의 치킨넘버 :"+numChickenTree);
	}
}
