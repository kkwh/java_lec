package edu.java.inheritance09;

// enum:
// (1) 열거형 상수(들)을 정의하는 특별한 종류의 클래스.
// (2) java.lang.Enum 클래스를 상속하는 특별한 하위 클래스.
// (3) 필드, 생성자, 메서드를 선언(정의)할 수 있음.
// (4) enum 생성자는 반드시 private이어야 함.

class Test {
	public static final Test AM = new Test("오전");
	public static final Test PM = new Test("오후");
	
	private String meaning;
	
	private Test(String meaning) {
		this.meaning = meaning;
	}
}

enum Time {
	AM("오전"), PM("오후");
	
	// 필드
	private String meaning;
	
	// 생성자 - enum 생성자는 반드시 private.
	private Time(String meaning) {
		this.meaning = meaning;
	}
	
	// 메서드
	public String getMeaning() {
		return meaning;
	}
}


public class EnumTestMain {

	public static void main(String[] args) {
		Singleton s = Singleton.INSTANCE;
		//-> enum 타입이 열거형 상수를 1개만 가지고 있으면,
		// 그 enum 타입에 할당할 수 있는 객체는 1개만 있게 됨.
		//-> 싱글톤 객체
		
		Time t = Time.PM;
		System.out.println(t); // am.toString()의 리턴 값을 출력.; Enum이 오버라이딩 함.
		System.out.println(t.name()); // toString()와 유사; Enum 클래스에서 상속받은 메서드
		System.out.println(t.ordinal()); // Enum 클래스에서 상속받은 메서드
		System.out.println(Time.values());
		Time[] times = Time.values(); // Enum 클래스에서 상속받은 static 메서드.
		for(Time x : times) {
			System.out.println(x + ":" + x.getMeaning());
		}
		
	}

}
