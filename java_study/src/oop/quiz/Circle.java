package oop.quiz;

public class Circle extends Shape {
	
	
	private int radius;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		double area = radius * radius *Math.PI;
		return area;
	}
	
	
	
	
}



