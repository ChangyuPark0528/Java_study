package oop.basic;

public class Phone {
	
	String model;
	String color;
	int price;
	
	Phone(){
		model = "갤럭시 s23";
		color = "블랙";
		price = 1230000;
	}
	
	Phone(String pModel){
		model = pModel;
		color = "스페이스 그레이";
		price = 1300000;
	}
	
	Phone(String pModel, String cColor){
		model = pModel;
		color = cColor;
		price = 1400000;
	}
	
	
	void show() {
		System.out.println("*** 정보 ***");
		System.out.println("모델명: " + model);
		System.out.println("색상: " + color);
		System.out.println("가격: " + price + " 원");
	}
	
	
	

}
