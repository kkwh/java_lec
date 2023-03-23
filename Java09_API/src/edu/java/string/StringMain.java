package edu.java.string;

import java.util.Arrays;

public class StringMain {

	public static void main(String[] args) {
		// Ex 1. 아래의 주민번호 문자열에서 성별을 표시하는 위치의 문자만 출력.
		String ssn = "991231-1234567";
		System.out.println(ssn.lastIndexOf("1"));
		System.out.println("================");
		
		// Ex 2. 아래의 문자열 배열에서 "홍길동" 문자열이 처음 등장하는 인덱스를 출력.
		// 만약에 "홍길동" 문자열이 배열에 없으면 -1을 출력.
		String[] names = {"오쌤", "John", "Jane", "홍길동", "허균", "홍길동"};
//		int index = -1;
//		for(int i=0; i<names.length; i++) {
//			if(names[i].equals("홍길동")) {
//				index = i;
//				break;
//			}
//		}
//		System.out.println("홍길동 인덱스 : " + index);
		System.out.println(Arrays.asList(names).indexOf("홍길동"));
		System.out.println(Arrays.asList(names).indexOf("ㅇㅇㅇ"));
		System.out.println("================");
		
		
		
		// Ex 3. 아래의 문자열 배열에서 5글자 이상인 문자열들을 찾아서 출력.
		String[] languages = {"Java", "SQL", "HTML", "CSS", "JavaScript", "Python"}; 
		for(int i=0; i<languages.length; i++) {
			if(languages[i].length() >= 5) System.out.println(languages[i]);
		}
		System.out.println("================");
		
		
		
		// Ex 4. 아래의 문자열 배열에서 대소문자 구별 없이 "est"가 포함된 문자열들을 찾아서 출력.
		String[] tests = {"TEST", "test", "Test", "tEST", "테스트"};
		for(int i=0; i<tests.length; i++) {
			String s = tests[i].toLowerCase(); 
			if(s.contains("est")) System.out.println(tests[i]);
		}
		System.out.println("================");
		
		
		
		
		// Ex 5. 아래의 "YYYY-MM-DD" 형식의 날짜 문자열에서 연/월/일 정보를 int 타입 변수에 저장하고 출력.
		String date = "2023-03-22";
		
		int year;
		int month;
		int day;
		
//		int[] numArr = {year, month, day};
		String[] arr = date.split("-");
		
//		for(int i=0; i<numArr.length; i++) {
//			numArr[i] = Integer.parseInt(arr[i]);
//		}
//		
//		for(int i : numArr) System.out.println(i);
		year = Integer.parseInt(arr[0]);
		month = Integer.parseInt(arr[1]);
		day = Integer.parseInt(arr[2]);
		System.out.println("년: " + year);
		System.out.println("월: " + month);
		System.out.println("일: " +day);
	}

}
