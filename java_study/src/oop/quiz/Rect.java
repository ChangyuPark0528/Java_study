package oop.quiz;

public class Rect extends Shape{
	
	int wdith;
	int height;

	public Rect(String name,int wdith, int height) {
		super(name);
		this.wdith = wdith;
		this.height = height;
	}

	@Override
	public double getArea() {
		double area = wdith * height;
//		System.out.print("%s의 넓이는 %.1f 입니다.",name,);
		return area;
	}
	
	
	
	
}



