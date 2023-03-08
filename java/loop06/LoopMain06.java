package edu.java.loop06;

public class LoopMain06 {

	public static void main(String[] args) {
		// do-while 반복문
		int n = 1;
		do {
			System.out.print(n + " " );		// (int i)블록 내 지역변수로 선언 불가
			n++;
		} while(n <= 10);
		System.out.println();
		
		// do-while문은 반복 여부를 검사하기 전에 무조건 블록을 한 번 실행함.
		// for문과 while 문은 반복 여부를 먼저 검사하고, 조건이 참이면 블록을 실행함.
		n = 1;
		while(n < 5) {
			System.out.print(n + " ");
			n++;
		}
		System.out.println();
		
		n = 1;
		do {
			System.out.print(n + " ");
			n++;
		} while(n > 5);
	}

}
