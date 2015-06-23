package betaspring.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by arahansa on 15. 6. 22.
 */
public class Sets {

    public static void main(String[] args) {
    	String[] arrChicken = 
    			new String[]{"교촌", "네네", "교촌", "통큰", "호식이두마리", "굽네", "호식이두마리"};
    	// 기본적인 HashSet
    	Set<String> setChicken = new HashSet<String>();
    	//중복은 제거된다.
    	for(String s : arrChicken)
    		setChicken.add(s);
    	System.out.println("중복제거된 치킨세트 :"+setChicken);
    	   	
    	//이진검색트리라는 자료구조 형태로 값을 저장하는 TreeSet 
    	Set<Integer> setLotto = new TreeSet<Integer>();
    	setLotto.add(5);
    	setLotto.add(3);
    	setLotto.add(42);
    	setLotto.add(41);
    	setLotto.add(41);
    	System.out.println("로또번호 :"+setLotto);
    	
    	// LinkedHashSet은 들어간 순서대로 정렬됨.
    	Set<String> setChickenLinked = new LinkedHashSet<String>();
    	for(String s : arrChicken)
    		setChickenLinked.add(s);
    	System.out.println("중복제거된 치킨세트(Linked) :"+setChickenLinked);
    }
}
