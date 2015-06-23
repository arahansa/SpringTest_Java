package betaspring.collections;

import java.lang.reflect.Array;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * Created by arahansa on 15. 6. 22.
 */
public class Lists {

    public static void main(String[] args) {
    	String[] arrChicken = new String[]{"교촌", "네네", "교촌", "통큰", "호식이두마리", "굽네", "호식이두마리"};
    	System.out.println("치킨 개수 :"+arrChicken.length);
    	// Arryas를 통한 초기화
    	List<String> listChicken =  Arrays.asList(arrChicken);
    	System.out.print("내가 먹고 싶은 치킨 : ");
    	listChicken.forEach(x->System.out.print(x+" "));
    	

    	System.out.print("\n월요일에 먹고 싶은 치킨 : ");
    	String chickenMonday = listChicken.get(DayOfWeek.MONDAY.getValue()-1);
    	System.out.println(chickenMonday);
    	
    	//어레이리스트를 하면서 처음부터 내부 배열 크기를 정할 수 있다.
    	ArrayList<String> listArrayChicken = new ArrayList<String>(7);
    	// addAll로 추가를 전부 해보자 
    	listArrayChicken.addAll(listChicken);
    	int posNene = listArrayChicken.indexOf("네네");
    	System.out.println("네네치킨 위치 : "+posNene);
    	//용량을 크기에 맞게 줄여보자~
    	listArrayChicken.trimToSize();
    	Object[] arrChicken2 =  listArrayChicken.toArray();
    	for(Object s: arrChicken2){
    		System.out.print(s);
    	}
    	System.out.println();
    	MyArrayList<String> listMine = new MyArrayList<String>(0);
    	listMine.trimToSize();
    	System.out.println("내가 만든 어레이리스트 사이즈 :"+listMine.size());
    	listMine.add("아");
    	listMine.add("졸");
    	listMine.add("리");
    	listMine.add("다");
    	// MyArrayList는 출력하는데 뭔가 애로사항이 있다.
    	
    	// Vector는 내부에 크기와 용량을 가지고서 용량이 두배씩 늘어난다. 
    	Vector<String> vector = new Vector(2);
    	vector.add("아");
    	System.out.println("벡터 크기 :"+vector.size());
    	System.out.println("벡터 용량 :"+ vector.capacity());
    	vector.add("아");vector.add("아");
    	System.out.println("벡터 크기 :"+vector.size());
    	System.out.println("벡터 용량 :"+ vector.capacity());
    	
    	//숫자 정렬?
    	List<Integer> listNumber = new ArrayList<Integer>();
    	for(int i=0;i<5;i++){
    		listNumber.add((int) (Math.random()*5));
    	}
    	
    	System.out.println("숫자 리스트 :"+listNumber);
    	Collections.sort(listNumber);
    	System.out.println("숫자 리스트 :"+listNumber);
    	
    	
    }
}
