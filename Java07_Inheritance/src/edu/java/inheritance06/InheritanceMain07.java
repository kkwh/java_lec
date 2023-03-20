package edu.java.inheritance06;

public class InheritanceMain07 {

	public static void main(String[] args) {
		User u1 = new User("kkk", "123");
		User u2 = new User("kkk", "123");
		System.out.println("u1: " + u1);
		System.out.println("u2: " + u2);
		
		System.out.println("== 연산자: " + (u1==u2));
		System.out.println("equals 메서드: " + u1.equals(u2));
		
		System.out.println("u1.hashCode: " + u1.hashCode());
		System.out.println("u2.hashCode: " + u2.hashCode());
		System.err.println("======================================");
		
		User u3 = new User();
		System.out.println("u1: " + u1);
		System.out.println("u3: " + u3);
		System.out.println("== 연산자: " + (u1==u3));
		System.out.println("equals 메서드: " + u1.equals(u3));
		
		System.out.println("u1.hashCode: " + u1.hashCode());
		System.out.println("u3.hashCode: " + u3.hashCode());
	}

}
