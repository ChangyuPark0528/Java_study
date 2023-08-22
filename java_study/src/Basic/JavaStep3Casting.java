package Basic;

public class JavaStep3Casting {

	public static void main(String[] args) {
		/*
		 -크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
		 	자바 가상머신 (JVM)이 자동으로 타입을 올려서 변환해줌.
		 	(promotion, UpCasting)
		 */
		
		/*
		 * 형 변을 이해하기위해선 데이터 타입의 크기를 알아야한다.
		 * 데이터 크기는 다음과같음.
		 * byte -> short,char -> int -> long -> float -> double
		 * long이 높은것같지만 표현할 수 있는 수는 float가 더 크다.
		 * 
		 * 연산과정에서 어느쪽 데이터 타입이 큰지 작은지 알아야
		 * 자동으로변환이 일어날지 수동으로 변환을 해야할지 판단 할 수 있다.
		 */
		
		
		//자동 형 변환
		//변환해야 할 데이터 타입의 크기가 작음->큼 이면
		//자동으로 변환이 된다.
		byte b = 10;
		int i = b; //byte -> int로 변환된 후 대입연산 진행됨.
		System.out.println(i);
		
		char c = '진'; //문자 하나의 데이터 타입 'char'
		int j = c; // 변수로 선언된 c(문자'진')을 int(데이터타입:정수)로 변환
		System.out.println("'진'의 문자번호:"+j);
		
		int k = 500;
		double d = k; // 변수 k(500(정수))를 실수 d로 변환.
		System.out.println(d); //500.0
		
		
		//명시적 형 변환
		/*
        - 크기가 큰 데이터 타입의 값을 작은 데이터 타입으로 변환하려면
         반드시 형 변환 연산자: (type)를 사용하여 명시적으로
         형 변환을 진행해야함. (DownCasting)
         
        - 명시적으로 형 변환을 해야 하는 이유는, DownCasting의 경우
         저장 공간이 줄어들어 데이터 손실의 가능성이 항상 존재하기 때문.
         (overflow, underflow)
        */
		
		int g = 98;
		char t = (char) g; //g의 데이터 타입이 int로 더 큼, 따라서 작은데이터타입을 명시해야한다.
		System.out.println("98의 문자값:"+t);
		
		double q = 4.99689;
		int w = (int) q;
		System.out.println("손실된 데이터:'99689'"+w*1000000);
		
		int m = 1000;
		byte v = (byte) m;
		System.out.println(v);
		//byte의 데이터 타입은 1000을 표기할 수 없기때문에 값이 박살난다.
		
		

	}

}
