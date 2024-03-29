package edu.java.lambda02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LambdaMain02 {

	public static void main(String[] args) {
		Random random = new Random();
		
		ArrayList<Integer> numbers = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			numbers.add(random.nextInt(100));
		}
//		System.out.println(numbers);
		
		for(Integer x : numbers) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		numbers.forEach(i -> System.out.print(i + " "));

		System.out.println();
		
		// 리스트 numbers에서 짝수들만 선택해서 새로운 리스트에 저장하고 출력.
		ArrayList<Integer> list = new ArrayList<>();
//		for(int i=0; i<numbers.size(); i++) {
//			if(numbers.get(i) % 2 == 0) list.add(numbers.get(i));
//		}
//		System.out.println(list);
		
		for(Integer i : numbers) {
			if(i % 2 == 0) list.add(i);
		}
		System.out.println(list);
		
		List<Integer> evens2 = numbers.stream() // 리스트의 원소들이 흘러가는 통로
				.filter(x -> x % 2 == 0) // 조건을 만족하는 원소들만 필터링
				.toList(); // 필터링된 결과를 리스트로 만듦.
		System.out.println(evens2);
		// filter 메서드의 argument:
		// 파라미터가 1개이고 리턴 타입이 boolean인 FunctionalInterface 객체를 전달.
		
		// 리스트 numbers에서 홀수들의 제곱을 저장하는 리스트를 만들고 출력.
		List<Integer> oddSquares = new ArrayList<>();
		for(Integer i : numbers) {
			if(i % 2 != 0) oddSquares.add(i * i);
		}
		System.out.println(oddSquares);
		
		List<Integer> oddSquares2 = numbers.stream() // 리스트의 원소들이 순서대로 지나가는 통로
				.filter(x -> x % 2 != 0 ) // 조건을 만족하는 원소들만 필터링
				.map(x -> x * x) // 필터링된 값을 다른 값으로 매핑(변환)
				.toList(); // 결과를 리스트로 저장.
		System.out.println(oddSquares2);
		// map 메서드의 argument:
		// 파라미터가 1개이고, 리턴 값이 있는(void가 아닌) FunctionalInterface 객체.
		
		List<String> languages = Arrays.asList("Java", "SQL", "JavaScript", "Python");
		// 리스트 languages에서 5글자 이상인 문자열을 소문자로 변환한 문자열을 원소로 갖는 리스트를 만들고 출력.
		
		List<String> fiveWords = new ArrayList<>();
		for(String s : languages) {
			if(s.length() >= 5) fiveWords.add(s.toLowerCase());
		}
		System.out.println(fiveWords);
		
		
		List<String> fiveWords2 = languages.stream()
				.filter(x -> x.length() >= 5)
				.map(x -> x.toLowerCase())
				.toList();
		System.out.println(fiveWords2);
	}
}
