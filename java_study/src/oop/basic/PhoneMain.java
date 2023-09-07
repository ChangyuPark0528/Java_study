package oop.basic;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone galaxy = new Phone();
		Phone iPhone13 = new Phone("아이폰 13");
		Phone iPhone14 = new Phone("아이폰 14","퍼플");
		
		System.out.println("-----------------------------");
		
		galaxy.show();
		iPhone13.show();
		iPhone14.show();


	}

}
