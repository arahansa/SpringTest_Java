package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Calculator {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum+=i;
		}
		System.out.println("1부터 100까지의 합 : " +sum);
		
		sum = IntStream.range(1, 101).sum();
		System.out.println("1부터 100까지의 합 : " +sum);
	}
	
	
	
}
