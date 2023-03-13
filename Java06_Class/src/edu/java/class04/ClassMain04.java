package edu.java.class04;

public class ClassMain04 {

	public static void main(String[] args) {
		Product p1 = new Product();
		System.out.println(p1);
		p1.printProductInfo();
		
		Product p2 = new Product(11111, "노트북", 100 );
		System.out.println(p2);
		p2.printProductInfo();
		
		Product p3 = new Product(22222, "TV");
		System.out.println(p3);
		p3.printProductInfo();
		p3.setProductPrice(50);
		p3.printProductInfo();
	}

}
