package oop.basic;

public class BookMain {

	public static void main(String[] args) {
		
		Book redBook = new Book();
		Book blackBook = new Book();
		Book greenBook = new Book();
		
		
		blackBook.name = "프로메테우스";
		greenBook.name = "그린북";
		redBook.name = "산타클로스";
		
		blackBook.color = "검정";
		greenBook.color = "초록";
		redBook.color = "초록";
		
		blackBook.price = 65000;
		greenBook.price = 35000;
		redBook.price = 54000;
		
		System.out.println("------------------------");
		
		blackBook.writh("아라크네","검정",58000);
//		greenBook.writh();
//		redBook.writh();
		
		System.out.println("------------------------");
		
		blackBook.bookInfo();
		greenBook.bookInfo();
		redBook.bookInfo();
		

	}

}



