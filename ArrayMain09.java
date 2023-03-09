package edu.java.array09;

import java.util.Random;

public class ArrayMain09 {

	public static void main(String[] args) {
		// 1차원 정수(int) 배열 3개를 갖는 2차원 배열을 선언.
		int[][] arr = new int[3][];

		// 첫번째 배열에는 난수 2개, 두번째 배열에는 난수 3개, 세번째 배열에는 난수 4개 저장.
		// 저장하는 난수의 범위는 0 이상 100 이하.
//		arr[0] = new int[2];
//		arr[1] = new int[3];
//		arr[2] = new int[4];
		Random rand = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = new int[i+2];
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = rand.nextInt(101);
			}
		}

//		Random rand = new Random();
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				arr[i][j] = rand.nextInt(101);
//				
//			}
//		}

		// 2차원 배열의 원소들을 출력.
		for(int x[] : arr) {
			for(int y : x ) {
				System.out.print(y + "\t");
			}
			System.out.println();
		}
		System.out.println();

		// 2차원 배열의 모든 원소들의 합을 계산하고 출력.
		int sum = 0;
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		//    	for(int x[] : arr) {
		//    		for(int y : x) {
		//    			sum += y;
		//				count++;
		//    		}
		//    	}
		System.out.println("모든 원소들의 합 : " + sum);

		// 2차원 배열의 모든 원소들의 평균을 계산하고 출력.
		double average = (double)sum / count;
		System.out.println("모든 원소들의 평균 : " + average);

		// 최댓값을 찾고 출력.
		int max = 0;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				if(arr[i][j] > max) {
//					max = arr[i][j];
//				}
//			}
//		}
		    	for(int[] x : arr) { // 2차원 배열의 원소인 1차원 배열들에 대해서
		    		for(int y : x) {  // 1차원 배열의 각 원소들에 대해서
//		    			if(y > max) {
//		    				max = y;
//		     			}
		    			max = (y > max) ? y : max;
		    		}
		    	}
		System.out.println("최댓값 : " + max);

		// 최솟값을 찾고 출력.
		int min = arr[0][0];
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				if(arr[i][j] < min) {
//					min = arr[i][j];
//				}
//			}
//		}
		    	for(int[] x : arr) {
		    		for(int y : x) {
//		    			if(y < min) {
//		    				min = y;
//		     			}
		    			min = (y < min) ? y : min;
		    		}
		    	}
		System.out.println("최솟값 : " + min);
		
		int columnSum1 = 0;
		int columnSum2 = 0;
		int columnSum3 = 0;
		int columnSum4 = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(j==0) columnSum1 += arr[i][j];
				else if(j==1) columnSum2 += arr[i][j];
				else if(j==2) columnSum3 += arr[i][j];
				else columnSum4 += arr[i][j];
			}
		}
		System.out.println("원소 1열의 총합 : " + columnSum1 );
		System.out.println("원소 2열의 총합 : " + columnSum2 );
		System.out.println("원소 3열의 총합 : " + columnSum3 );
		System.out.println("원소 4열의 총합 : " + columnSum4 );
	}

}