package Basic;

public class JavaStep3_1Casting {

	public static void main(String[] args) {
		char c = 'B';
		int i = 2;
		
		//서로 타입이 다른 기본 데이터의 연산 시에는 데이터 타입이 큰 쪽에
		//작은 쪽이 맞춰져서 자동으로 형 변환이 진행된 뒤에 연산이 진행된다.
		
		int intResult = c + i;
		char charReult = (char) (c + i);
		System.out.println(intResult);
		System.out.println(charReult);
		
		int k = 10;
		//변수 k(10)을 4로나누자 (2.5)
		//double d = k / 4; -> 이렇게만 출력하면 2.0으로 출력됨
		// 정수+정수는 정수로밖에 출력될 수 없기 때문에 둘중 하나는 실수로 변경해야함.
		double d = (double)k / 4; //데이터값변환 (double)으로 실수+정수이므로 2.5로 출력
		//double d = k / 4.0;
		System.out.println(d);
		
		//int보다 작은 크기의 데이터 연산은 자동으로 값이
		//int로 변환되어 처리됨.(테이터 손실의 방지)
		byte b1 = 100;
		byte b2	= 70;
		//합이 170 데이터타입이 byte로 출력불가일것같지만 자동으로 변환되어 170 정상출력됨. 
		System.out.println(b1+b2);

	}

}
