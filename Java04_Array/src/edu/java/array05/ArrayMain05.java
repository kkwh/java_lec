package edu.java.array05;

//import java.util.Arrays;
import java.util.Random;

public class ArrayMain05 {

	public static void main(String[] args) {
		int count = 10; // 배열의 길이(원소 개수)
		String male = "Male";
		String female = "Female";
		
		// int 10개를 저장할 수 있는 배열을 선언.
		int[] genderCodes = new int[count];
		
		// 배열에 난수(0,1) 10개를 저장.
		Random random = new Random();
		for(int i=0; i<count; i++) {
			genderCodes[i] = random.nextInt(2);			
		}
		
		// 배열의 내용을 출력.
		for(int x : genderCodes) {
			System.out.print(x + " ");
		}
		System.out.println();
//		System.out.println(Arrays.toString(genderCodes));
			
		// 문자열 10개를 저장할 수 있는 배열(genders)을 선언.
		String[] genders = new String[count];
		
		// gederCodes의 값이 0이면 "Male", 1이면 "Female"을 문자열 배열에 저장.
		System.out.println("0-Male   1-Female");
		for(int i=0; i<count; i++) {
			if(genderCodes[i] == 0) {
				genders[i] = male;
			} else {
				genders[i] = female;
			}
		}
		
		// 문자열 배열 genders의 내용을 출력.
		for(String x : genders) {
			System.out.print(x + " ");
		}
		System.out.println();
//		System.out.println(Arrays.toString(genders));
		
		// 문자열 배열에 저장된 "Male"의 개수, "Female"의 개수를 출력.
		// (힌트) 숫자 x와 y가 같은 지 비교 : x==y 
		// (힌트) 두 문자열 x,y가 같은 지 비교 : x.equals(y)
		int maleCount = 0;
		int femaleCount = 0;
		for(int i=0; i<count; i++) {
			if(genders[i].equals(male)) maleCount++;
			else femaleCount++;
		}
		System.out.println("Male의 개수 : " + maleCount);
		System.out.println("Female의 개수 : " + femaleCount);
		
		
//		int maleCount2 = 0;
//		int femaleCount2 = 0;
//		for(String x : genders) {
//			if(x.equals("Male")) maleCount2++;
//			else femaleCount2++;
//		}	
//		System.out.println("Male의 개수 : " + maleCount2);
//		System.out.println("Female의 개수 : " + femaleCount2);
		
	}

}
