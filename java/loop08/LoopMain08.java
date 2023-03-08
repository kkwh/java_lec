package edu.java.loop08;

public class LoopMain08 {

	public static void main(String[] args) {
		// 구구단 2단은 2x2까지, 3단은 3x3까지, 4단은 4x4까지, ..., 9단은 9x9까지 출력.

		// for
		for(int dan = 2; dan < 10; dan++) {
			System.out.println("---" +dan + "단 ---");
			for(int n =1; n <= dan; n++) {
				System.out.printf("%d x %d = %d%n", dan, n, dan * n);
			}
			System.out.println("-----------------------");
		}

		System.out.println("\n=========================\n");
		
		// while
		int dan = 2;
		while(dan < 10) {
			System.out.println("---" +dan + "단 ---");
			int n = 1;
			while(n <= dan) {
				System.out.printf("%d x %d = %d%n", dan, n, dan * n);
				n++;
			}
			dan++;
			System.out.println("-----------------------");
		}
		
		System.out.println("\n=========================\n");
		
		// for break
		for(int x = 2; x < 10; x++) {
			System.out.println("---" +x + "단 ---");
			for(int y = 1; y < 10; y++) {
				System.out.printf("%d x %d = %d%n", x, y, x * y);
				if(x == y) break;
			}
			System.out.println("-----------------------");			
		}
		
		System.out.println("\n=========================\n");
		
		// while break
		int x = 2;
		while(x < 10) {
			System.out.println("---" +x + "단 ---");
			int y = 1;
			while(y < 10) {
				System.out.printf("%d x %d = %d%n", x, y, x * y);
				if(x == y) break;
				y++;
			}
			x++;
			System.out.println("-----------------------");	
		}
	}

}
