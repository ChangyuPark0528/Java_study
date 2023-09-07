package oop.basic;

public class Book {
	
	String name;
	String color;
	int price;
	
	void writh(String name, String color, int price) {
		System.out.printf("%s의 색은 %s색 이고 가격은 %d원 입니다.\n",name,color,price);
	}
	
	void bookInfo() {
		System.out.println(name + " 의 가격은 " + price + "원 입니다.");
	}
	
}
