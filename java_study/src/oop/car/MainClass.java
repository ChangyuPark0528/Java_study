package oop.car;

public class MainClass extends Car{

	public static void main(String[] args) {
		
		Car s1 = new Sonata();
		Car t1 = new Tesla();
		Car k1 = new K5();
		
		Driver park = new Driver();
		
		park.drive(s1);
		System.out.println("--------------------------");
		
		
		

	

	}

}
