package oop.basic;

//객체 설계용 클래스는 메인 메서드를 작성하지 않는다.

public class Pen {
	
	//객체의 속성을 필드(멤버 변수)라고함.
	String color;
	int price;
	
	void write() {
		System.out.println(color + "색 펜 입니다.");
	}
	
	void penInfo() {
		System.out.println(color + "색 펜의 가격은 " + price + "원 입니다.");
	}

}
