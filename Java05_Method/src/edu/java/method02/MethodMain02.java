package edu.java.method02;

import java.util.Arrays;
import java.util.Random;

public class MethodMain02 {

	public static void main(String[] args) {
		// argument를 가지고, 리턴 값이 있는 메서드 작성/호출 연습

		// 같은 클래스 안에서 작성한 메서드인 경우에는 메서드 이름으로만 호출하면 됨.

		int X = 1; int Y = 2;
		System.out.println("X=" + X+ " Y=" + Y);

		double addResult = add(X, Y); // 메서드 호출. argument - 1, 2.
		System.out.println("X + Y = " + addResult);

		double subtractResult = subtract(X, Y); 
		System.out.println("X - Y = " + subtractResult);

		double multiplyResult = multiply(X, Y); 
		System.out.println("X * Y = " + multiplyResult);

		double divideResult = divide(X, Y); 
		System.out.println("X / Y = " + divideResult);

		boolean evenResult = isEven(1);
		if (evenResult == true) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		int[] numbers = makeArray(5);
//		for(int x : numbers) {
//			System.out.print(x + " ");
//		}
		System.out.println(Arrays.toString(numbers));
	}

	/**
	 * 실수 2개를 전달받아서, 덧셈 결과를 리턴하는 메서드.
	 * @param x 실수(double) 타입.
	 * @param y 실수(double) 타입.
	 * @return x + y.
	 */
    public static double add(double x, double y) {
        // 메서드 정의(선언)
        // 메서드 수식어 - public static
        // 메서드 리턴 타입 - double
        // 메서드 이름 - add
        // 파라미터(parameter) - double x, double y
        
        return x + y; // 리턴 문장. x + y -> 리턴 값.
    }
    
    /**
     * subtract
     * 숫자 2개를 전달받아서, 뺄셈의 결과를 반환.
     * @param x double.
     * @param y double.
     * @return x - y.
     */
    public static double subtract(double x, double y) {
    	return x - y;
    }
    
    /**
     * multiply
     * 숫자 2개 전달받아서 곱셈 결과를 반환.
     * @param x double.
     * @param y double.
     * @return x * y.
     */
    public static double multiply(double x, double y) {
    	return x * y;
    }
    
    /**
     * divide
     * 숫자 2개를 전달받아서, 나눗셈 결과를 반환.
     * @param x double.
     * @param y double.
     * @return x / y.
     */
    public static double divide(double x, double y) {
    	return x / y;
    }
    
    /**
     * isEven
     * 정수가 짝수인 지 아닌 지를 리턴하는 메서드.
     * @param n 짝수인 지 홀수인 지 검사할 정수.
     * @return n이 짝수이면 true, 그렇지 않으면 false.
     */
    public static boolean isEven(int n) { 
       	return n % 2 == 0;
//    	boolean result = false; // 짝수인 지, 홀수인 지를 저장할 변수.
//    	
//    	if(n % 2 == 0) result = true;
//    	else result = false;
//    	
//    	return result;
    }
    
    /**
     * makeArray
     * argument로 전달된 배열의 길이 크기의 정수 배열을 생성하고,
     * 임의의 난수들로 배열을 초기화해서 리턴하는 함수.
     * @param length 배열의 길이. 양의 정수.
     * @return length개의 난수들로 초기화된 정수 배열.
     */
    public static int[] makeArray(int length) {
    	int[] arr = new int[length];
    	Random random = new Random();
    	
    	for(int i=0; i<length; i++) {
    		arr[i] = random.nextInt(10);
    	}
    	
    	return arr;
    }
    
}