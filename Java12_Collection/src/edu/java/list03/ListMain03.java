package edu.java.list03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListMain03 {

	public static void main(String[] args) {
		// 문자열들을 원소로 갖는 리스트 생성과 동시에 초기화.
		// Arrays.asList(...) - 아규먼트로 전달된 값들을 원소로 갖는 리스트 객체를 생성.
		List<String> subjects = Arrays.asList("Java", "SQL", "HTML",
				"CSS", "JavaScript", "Servlet", "JSP", "Spring", "Python");
		System.out.println(subjects);
		
		// 리스트 subjects에서 5글자 이상인 문자열들만 저장하는 리스트를 만들고 출력.
		ArrayList<String> wordList = new ArrayList<>();
//		for(int i=0; i<subjects.size(); i++) {
//			if(subjects.get(i).length() >= 5) wordList.add(subjects.get(i));
//		}
		
//		for(String s : subjects) {
//			if(s.length() >= 5) wordList.add(s);
//		}
		
		Iterator<String> itr = subjects.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			if(s.length() >= 5) wordList.add(s);
			
		}
		System.out.println(wordList);
		
		// 리스트 subjects의 원소들의 글자수를 저장하는 리스트를 만들고 출력.
		ArrayList<Integer> counts = new ArrayList<>();
		for(int i=0; i<subjects.size(); i++) {
			counts.add(subjects.get(i).length());
		}
		System.out.println(counts);
		
		// 정수(0, 1)을 저장하는 리스트를 생성.
		List<Integer> codes = Arrays.asList(0, 1, 0, 0, 1, 1);
		
		// 리스트 codes의 원소가 0이면 "Male", 1이면 "Female"을 원소로 갖는 리스트를 만들고 출력.
		ArrayList<String> gender = new ArrayList<>();
		for(int i=0; i<codes.size(); i++) {
			gender.add((codes.get(i) == 0) ? "Male" : "Female");
		}
		
//		for(Integer i : codes) {
//			gender.add((i == 0) ? "Male" : "Female"); 
//		}
		System.out.println(gender);
	}

}
