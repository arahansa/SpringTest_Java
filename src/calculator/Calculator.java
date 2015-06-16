package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Calculator {
	
	
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int sum = 0;
		
		//for문
		for (int i = 1; i <= 100; i++) 
			sum+=i;
		calculator.printSum("포문 : ", sum);
		
		//람다
		sum = IntStream.range(1, 101).sum();
		calculator.printSum("람다 :", sum);
		
		//재귀함수
		sum = calculator.sum(100);
		calculator.printSum("재귀함수 :", sum);
		
		// ArrayList
		sum = calculator.sum(calculator.range(1, 100));
		calculator.printSum("리스트추가 :", sum);
	}

	//재귀함수에 쓰인 sum
	private int sum(int i){
		return (i==1) ? 1 : sum(i-1)+i;
	}

	 /*	 IntStream 레인지같이 시도를해볼까?! 전역변수로 list를 뺄까말까 고민을 했었다.
	 range초기에는 Arraylist선언후 i부터 넣고  
	 subRange를 돌려 i를 늘려가면서 j까지 더함 */
	private List<Integer> range(int i, int j){
		List<Integer> list = new ArrayList<Integer>();
		list.add(i);
		return (i==j) ? list : subRange(list, ++i, j);
	}
	private List<Integer> subRange(List<Integer> list, int i, int j){
		list.add(i);
		return (i==j) ? list : subRange(list, ++i, j);
	}
	
	// IntStream sum 같이? 체인연결하고싶지만 욕심같다. 파라미터로 연결!ㅠ
	private int sum(List<Integer> list){
		return sum(list, 0 , list.size()-1); 	
	}
	private int sum(List<Integer> list, int i, int maximum) {
		if(i==maximum){
			return list.get(maximum);
		}else{
			return list.get(i)+sum(list, ++i, maximum);
		}
	}

	private  void printSum(String msg , int sum) {
		System.out.println(msg + "1부터 100까지의 합 : " +sum);
	}
}
