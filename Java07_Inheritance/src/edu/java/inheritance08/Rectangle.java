package edu.java.inheritance08;

public class Rectangle extends Shape {

	private double width; // 직사각형의 가로 길이
	private double height; // 직사각형의 세로 길이
	
	public Rectangle(String type, double width, double height) {
		super(type);
		this.width = width;
		this.height = height;
		
	}

	@Override
	public double area() {
		return width * height;
//		return Math.round(width * height);
	}

	@Override
	public double perimeter() {
		return (width + height) * 2;
	}

}
