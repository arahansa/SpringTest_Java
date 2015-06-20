package betaspring.calculator;

import java.util.ArrayList;

public class MyClass {

	public static void main(String[] args) {
		/*
		 * 과제 1-1. 1부터 100까지 숫자의 합을 출력하세요
		 */
		int sumNum = 0;
		for (int i = 1; i <= 100; i++) {
			sumNum += i;
		}
		System.out.println("1-1: " + sumNum);
		
		/*
		 * 과제 1-2. 반복문을 사용하지 않고 1~100까지 숫자의 합을 출력하세요.
		 * 
		 * 1부터 100까지의 합은 1과 100, 2와 99, 3과 98 처럼 합이 101인 값이 50쌍이 있어요.
		 * 만약 max값이 짝수가 아니라면 예외처리가 필요합니다.
		 * 증가값이 1인 수열에만 적용됩니다.
		 */
		int minNum = 1;
		int maxNum = 100;
		int middleNum = maxNum/2;

		sumNum = (minNum + maxNum) * middleNum;
		System.out.println("1-2: " + sumNum);

		/*
		 * 과제 1-3. 재귀함수를 사용하여 1~100까지의 합을 구하세요.
		 */
		MyClass myClass = new MyClass();
		sumNum = myClass.recursion(minNum, maxNum);
		System.out.println("1-3: " +sumNum);
		
		/*
		 * 과제 1-4. ArrayList를 이용하여 1~100까지의 합을 구하세요.
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = myClass.subRecursion(minNum, maxNum, list);
		
		//재귀함수 재활용
		ArrayList<Integer> testList = new ArrayList<Integer>();
		testList.add(myClass.recursion(minNum, maxNum)); //자바5.0이상 오토박싱
		System.out.println("1-4 : " +testList.get(0));
		
	}
	
	public int increase(int min, int max) {
		return (min < max) ? ++min : min;
	}
	
	public int recursion (int min, int max) {
		return (min < max) ? min + recursion(++min, max) : min;
	}
	
	public ArrayList<Integer> subRecursion(int min, int max, ArrayList<Integer> list) {
		list.add(min);
		return (min < max) ? subRecursion(++min, max, list) : list;
	}

}