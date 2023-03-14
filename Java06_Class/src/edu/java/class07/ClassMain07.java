package edu.java.class07;

public class ClassMain07 {

	public static void main(String[] args) {
		Score s1 = new Score();
		s1.printScore();
		System.out.println("총점: " + s1.getTotal());
		System.out.println("평균: " + s1.getAverage());
		System.out.println();
		
		Score s2 = new Score(100, 90, 80);
		s2.printScore();
		System.out.println("총점: " + s2.getTotal());
		System.out.println("평균: " + s2.getAverage());
		System.out.println();
		
		Student std1 = new Student();
		std1.printStudent();
		System.out.println();
		
		Student std2 = new Student(10, "홍길동", s2);
		std2.printStudent();
		
		/*-------------------------------------------*/
		String emptyString = "";
		System.out.println("길이: " + emptyString.length());
		String nullString = null;
//		System.out.println("길이: " + nullString.length());
		// -> NullPointerException 발생
		// null: 생성된 객체가 없다.
		// 데이터 타입의 기본값:
		// (1) boolean - false, (2) 정수 - 0, (3) 실수 - 0.0 (4) 참조(클래스) 타입 - null
		/*-------------------------------------------*/
	}

}
