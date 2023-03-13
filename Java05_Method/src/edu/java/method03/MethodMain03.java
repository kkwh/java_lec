package edu.java.method03;

import java.util.Random;

public class MethodMain03 {
	public static int[] makeTestArray(int n) {
		int[] array = new int[n];
		
		Random random = new Random();
		for(int i=0; i<n; i++) {
			array[i] = random.nextInt(10);
		}
		return array; 
	}
	
    public static void printTestArray(int[] array) {
    	System.out.print("[");
         for(int x : array) {
         	System.out.print(x + " ");
         }
         System.out.println("]");
         
         // void 타입의 메서드에서는 return; 문을 생략해도 됨.
    }
	
    public static void main(String[] args) {
    	// 메서드 기능 테스트 배열
        int[] array = makeTestArray(10);
        
        
        // 테스트 데이터 출력하기
        printTestArray(array);
        
//        for(int i=0; i<array.length; i++) {
//        	array[i] = random.nextInt(100);
//        }
//        for(int x : array) {
//        	System.out.print(x + " ");
//        }
//        System.out.println();
        
        System.out.println("총합 = " + sum(array));
        
        System.out.println("평균 = " + mean(array));
        
        System.out.println("최댓값 = " + max(array));
        
        System.out.println("최댓값의 인덱스 = " + maxAt(array));
        
        System.out.println("최솟값 = " + min(array));
        
        System.out.println("최솟값의 인덱스 = " + minAt(array));
        
    }
     	static int score = 0;
    /**
     * sum
     * 정수 배열의 모든 원소들의 합을 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 합.
     */
    public static int sum(int[] arr) {
    	int sum = 0;
    	for(int x : arr) {
    		sum += x;
    	}
    	score = sum;
    	return sum;
    }
    
    /**
     * mean
     * 정수 배열의 모든 원소들의 평균을 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 평균(double).
     */
    public static double mean(int[] arr) {
    	
    	return (double)sum(arr) / arr.length;
    	
//    	double average = (double)score / arr.length;
//    	return average;
    }
    
    static int maxIndex = 0;
    /**
     * max
     * 정수 배열에서 최댓값을 찾아서 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값.
     */
    public static int max(int[] arr) {
    	int max = 0;
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] > max) {
    			max = arr[i];
    			maxIndex = i;
    		}
    		
    	}
    	return max;
    	
//    	int max2 = arr[0];
//    	for(int x : arr) 
//    		max2 = (x > max2) ? x : max2;
//    	return max2;
    }
    
    /**
     * maxAt
     * 정수 배열에서 최댓값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값의 인덱스.
     * 최댓값이 여러개 있는 경우, 첫번째 최댓값의 인덱스.
     */
    public static int maxAt(int[] arr) {
//    	int max = 0;
//    	int index = 0;
//    	for(int i=0; i<arr.length; i++) {
//    		if(arr[i] > max) {
//    			max = arr[i];
//    			index = i;
//    		}
//    	}
//    	return index;
    	return maxIndex;
    }
    	
    static int minIndex = 0;
    /**
     * min
     * 정수 배열에서 최솟값을 찾아서 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최솟값.
     */
    public static int min(int[] arr) {
    	int min = arr[0];
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] < min) {
    			min = arr[i];
    			minIndex = i;
    		}
    	}
    	return min;
    	
//    	int minVal = 0;
//    	for(int x : arr) {
//    	minVal = (minVal > x) ? x : minval;
//		return minVal;
    	}
    	
    
    
    /**
     * minAt
     * 정수 배열에서 최솟값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최솟값의 인덱스.
     * 최솟값이 여러개 있는 경우, 첫번째 최솟값의 인덱스.
     */
    public static int minAt(int[] arr) {
//    	int min = arr[0];
//    	int index = 0;
//    	for(int i=0; i<arr.length; i++) {
//    		if(arr[i] < min) {
//    			min = arr[i];
//    			index = i;
//    		}
//    	}
//    	return index;
//    	return minIndex;
    	
    	// 최솟값을 찾음.
    	// 배열의 원소들을 순서대로 반복하면서, 그 원소가 최솟값인 지 검사.
    	// 최솟값을 찾았으면 반복을 종료.
    	// 반복문이 종료됐을 때의 인덱스를 리턴한다.
    	int minVal = min(arr);
    	int index = 0;
    	for(index =0; index<arr.length; index++) {
    		if(arr[index] == minVal) break;
    	}
    	return index;
    }
}