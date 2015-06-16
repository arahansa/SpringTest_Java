package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Calculator {

	private static final int numSize = 100;
	
	public static void main(String[] args) {
		int sum = 0;
		//for문
		for (int i = 1; i <= 100; i++) {
			sum+=i;
		}
		System.out.println("1부터 100까지의 합 : " +sum);
		
		//람다
		sum = IntStream.range(1, 101).sum();
		System.out.println("1부터 100까지의 합 : " +sum);
		
		//재귀함수
		sum = sum(100);
		System.out.println("1부터 100까지의 합 : " +sum);
	}
	
	private static int sum(int i){
		if (i==1){
			return 1;
		}else{
			return sum(i-1)+i;
		}
	}
}
