package edu.java.class08;

public class ClassMain08 {

	public static void main(String[] args) {
		Account account = new Account(111111111, 10000);
		Account account2 = new Account(999999999, 10000);
		account.printInfo();
		account2.printInfo();
		
		account.deposit(5000);
		account.printInfo();
		
		account.withdraw(9000);
		account.printInfo();
		
		System.out.println("--------------------");
		if(account.transfer(account2, 5000)) System.out.println("이체 성공");
		else System.out.println("이체 실패");
		
		account.printInfo();
		account2.printInfo();
	}

}
