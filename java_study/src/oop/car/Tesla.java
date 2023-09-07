package oop.car;

public class Tesla extends Car{

	@Override
	void run() {
		System.out.println("테슬라가 달립니다.");
	}

	@Override
	void stop() {
		System.out.println("테슬라가 멈춥니다.");
	}
	
	
}
