package edu.java.class05;

public class ClassMain05 {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		System.out.println("가로 길이: " + rec.width + " 세로 길이: " + rec.height);
		System.out.println("둘레: " + rec.parimeter());
		System.out.println("넓이: " + rec.area());
		rec.width =1.0;
		rec.height =2.0;
		System.out.println("가로 길이: " + rec.width + " 세로 길이: " + rec.height);
		System.out.println("둘레: " + rec.parimeter());
		System.out.println("넓이: " + rec.area());
		System.out.println("=============================");
		
		Rectangle rec2 = new Rectangle(8.5, 4);
		System.out.println("가로 길이: " + rec2.width + " 세로 길이: " + rec2.height);
		System.out.println("둘레: " + rec2.parimeter());
		System.out.println("넓이: " + rec2.area());
	}

}
