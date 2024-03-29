package edu.java.inheritance08;

public class InheritanceMain08 {

	public static void main(String[] args) {
		// 추상 클래스는 생성자를 호출할 수 없음. 객체를 생성할 수 없음.
//		Shape shape = new Shape("직사각형");
		Rectangle rectangle = new Rectangle("직사각형", 10, 20);
		rectangle.draw();
		
		Circle circle = new Circle("원", 10);
		circle.draw();
		
		Shape[] shapes = {
				new Rectangle("직사각형", 3, 4),
				new Circle("원", 3)
		};
		
		for(Shape s : shapes) s.draw();
		
		
	}

}
