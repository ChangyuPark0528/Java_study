package oop.car;

public class Car {
	
	
	Tire frontLeft;
	Tire frontRight;
	Tire rearLeft;
	Tire rearRight;
	
	
	void run() {
		System.out.println("자동차가 달립니다.");
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
	
}
