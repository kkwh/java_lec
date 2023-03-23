package edu.java.exception06;

import java.util.Scanner;

public class ExceptionMain06 {

	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO inputInteger() 메서드 테스트 코드
		ExceptionMain06 ex = new ExceptionMain06();
		int n = ex.inputInteger();
		System.out.println("입력한 정수는 " + n + "입니다.");
	}
	
	public int inputInteger() {
		// TODO Scanner를 사용해서 입력받은 정수를 리턴.
		// Integer.parseInt(scanner.nextLine()) 과정에서 NumberFormatException이 발생할 수 있음.
		
		int s = 0;
		while(true) {
			System.out.println("정수를 입력하세요>>> ");
			
			try {
				 s = Integer.parseInt(scanner.nextLine());
				
				break;

			} catch (NumberFormatException e) {
				System.out.println("정수를 다시 입력하세요. ");
			}
		}
		return s;
	}

}
