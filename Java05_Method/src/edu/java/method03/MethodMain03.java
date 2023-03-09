package edu.java.method03;

import java.util.Random;

public class MethodMain03 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        
        for(int i=0; i<array.length; i++) {
        	array[i] = random.nextInt(100);
        }
        for(int x : array) {
        	System.out.print(x + " ");
        }
        System.out.println();
        
        System.out.println("총합 = " + sum(array));
        
        System.out.println("평균 = " + mean(array));
        
        System.out.println("최댓값 = " + max(array));
        
        System.out.println("최댓값의 인덱스 = " + maxAt(array));
        
        System.out.println("최솟값 = " + min(array));
        
        System.out.println("최솟값의 인덱스 = " + minAt(array));
        
    }
    	
    /**
     * sum
     * 정수 배열의 모든 원소들의 합을 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 합.
     */
    public static int sum(int[] arr) {
    	int sum = 0;
    	for(int i=0; i<arr.length; i++) {
    		sum += arr[i];
    	}
    	
    	return sum;
    }
    
    /**
     * mean
     * 정수 배열의 모든 원소들의 평균을 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 모든 원소들의 평균(double).
     */
    public static double mean(int[] arr) {
    	int sum = 0;
    	for(int i=0; i<arr.length; i++) {
    		sum += arr[i];
    	}
    	double average = (double)sum / arr.length;
    	return average;
    }
    
    /**
     * max
     * 정수 배열에서 최댓값을 찾아서 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값.
     */
    public static int max(int[] arr) {
    	int max = 0;
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] > max) max = arr[i]; 
    	}
    	return max;
    }
    
    /**
     * maxAt
     * 정수 배열에서 최댓값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최댓값의 인덱스.
     * 최댓값이 여러개 있는 경우, 첫번째 최댓값의 인덱스.
     */
    public static int maxAt(int[] arr) {
    	int max = 0;
    	int index = 0;
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] > max) {
    			max = arr[i];
    			index = i;
    		}
    	}
    	return index;
    }

    /**
     * min
     * 정수 배열에서 최솟값을 찾아서 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최솟값.
     */
    public static int min(int[] arr) {
    	int min = arr[0];
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] < min) min = arr[i];
    	}
    	return min;
    }
    
    /**
     * minAt
     * 정수 배열에서 최솟값의 인덱스 리턴.
     * @param arr 정수 배열.
     * @return 배열 arr의 원소들 중 최솟값의 인덱스.
     * 최솟값이 여러개 있는 경우, 첫번째 최솟값의 인덱스.
     */
    public static int minAt(int[] arr) {
    	int min = arr[0];
    	int index = 0;
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] < min) {
    			min = arr[i];
    			index = i;
    		}
    	}
    	return index;
    }
    
}