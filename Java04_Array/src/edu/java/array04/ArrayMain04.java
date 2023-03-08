package edu.java.array04;
 
import java.util.Random;

public class ArrayMain04 {

	public static void main(String[] args) {

		// 정수 5개를 저장할 수 있는 배열을 선언.

		// 0 이상 9 이하의 정수 난수 5개를 배열에 저장.

		// 배열의 내용을 출력.

		// 배열의 모든 원소의 합을 계산하고 출력.

		// 배열 원소들의 평균을 double 타입으로 계산하고 출력.


		int[] n = new int[5];


		for(int i=0; i<n.length; i++) {
			Random random = new Random();
			n[i] = random.nextInt(10);
		}


		for(int x : n) {
			System.out.print(x + " ");
		} System.out.println();


		int sum = 0;

//		for(int i=0; i<n.length; i++) {
//			sum += n[i];
//		}
//		System.out.println("sum : " + sum);

		for(int x : n) {
			sum += x;
		}
		System.out.println("sum : " + sum);

		double average = (double)sum / n.length;
		System.out.println("average : " + average);
		
		
		// 배열의 원소들 중 최댓값을 찾고 출력.
		int max = n[0]; // 배열의 첫번째(인덱스 0번 위치의) 원소를 최댓값이라고 가정.
		for(int x : n) { // 배열의 모든 원소들을 순회하면서
			if(x > max) { // 배열에서 읽은 값이 max보다 크다면
				max = x;
			}
		}
		System.out.println("최댓값 : " + max);
		
//		int max = n[0];
//		for(int i=1; i<n.length; i++) {
//			if(n[i] > max) {
//				max = n[i];
//			}
//		}
//		System.out.println("최댓값 : " + max);
		
		
		
		// 배열의 원소들 중 최솟값을 찾고 출력.
		int min = n[0];
		for(int x : n) {
			if(x < min) {
				min = x;
			}
		}
		System.out.println("최솟값 : " + min);
		
//		int min = n[0];
//		for(int i=1; i<n.length; i++) {
//			if(n[i] < min) {
//				min = n[i];
//			}
//		}
//		System.out.println("최솟값 : " + min);
	}

}