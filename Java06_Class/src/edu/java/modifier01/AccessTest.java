package edu.java.modifier01;

public class AccessTest {
	// field
	private int a; // 같은 클래스 안에서만
	int b; // 패키지 범위
	protected int c;  // 같은 패키지 안에 있거나 상속하는 경우
	public int d;
	
	public AccessTest(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	
	public void printInfo() {
		System.out.printf("a=%d, b=%d, c=%d, c=%d\n", a, b, c, d);
	}
	
}
