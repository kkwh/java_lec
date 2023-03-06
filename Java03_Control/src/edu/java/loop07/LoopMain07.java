package edu.java.loop07;

public class LoopMain07 {

	public static void main(String[] args) {
		// 2중 반복문
		for (int dan = 2; dan < 10; dan++) {
			System.out.println("---" +dan + "단 ---");
			for (int n = 1; n < 10; n++) {
//				System.out.println(dan + " x " + n + " = " + (dan * n));
				System.out.printf("%d x %d = %d%n", dan, n, dan * n);
			}
		}
		
		System.out.println("\n=========================\n");
		//while문을 사용한 구구단 출력
		
		
		int dan = 2;	
		while (dan < 10) {
			System.out.println("---" +dan + "단 ---");
			int n = 1;
			while (n < 10) {
				System.out.printf("%d x %d = %d%n", dan, n, dan * n);
				n++;
			}
			dan++;
		}
	}

}
