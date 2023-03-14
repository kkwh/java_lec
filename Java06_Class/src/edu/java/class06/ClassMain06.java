package edu.java.class06;

public class ClassMain06 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.printInfo();
		System.out.println("둘레: " + c1.perimeter());
		System.out.println("넓이: " + c1.area());
		c1.printAll();
		
		System.out.println("==================");
		
		Circle c2 = new Circle(3);
		c2.printInfo();
		System.out.println("둘레: " + c2.perimeter());
		System.out.println("넓이: " + c2.area());
		c2.printAll();
	}

}
