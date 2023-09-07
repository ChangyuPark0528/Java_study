package oop.basic;

public class PenMain {

	public static void main(String[] args) {
		
		Pen redPen = new Pen(); // 클래스타입:Pen 설정한 변수명:redPen 
		Pen blackPen = new Pen();
		Pen bluePen = new Pen();
		
		//변수명으로 설정한 redPen안의 참조연산자를 이용해 접근하고(.)
		//타입에 맞는 데이터를 넣어준다.
		//여기서 color는 String 으로 문자열,
		//price는 int타입으로 정수를 입력하여 초기화함.
		redPen.color = "빨강";
		redPen.price = 500;
		
		blackPen.color = "검정";
		blackPen.price = 300;
		
		bluePen.color = "파랑";
		bluePen.price = 400;
		
		
		//Pen 클래스 안에서 설정한 메서드로 출력함.
		redPen.write(); 
		redPen.penInfo();
		
		System.out.println("--------------------");
		
		blackPen.write();
		blackPen.penInfo();
		
		System.out.println("--------------------");
		
		bluePen.write();
		bluePen.penInfo();
		
		
		
		
		
	}

}
