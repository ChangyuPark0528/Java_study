package Basic;

public class JavaStep2 {

	public static void main(String[] args) {
		//자바의 표준 출력 형식은 크게 3가지다.
				//1. 개행을 포함하지 않는 print()
				//2. 자동으로 개행을 포함해 주는 printIn()
				
				System.out.print("안녕하세요~!");		
				System.out.println("Hellow~!");
				System.out.print("bye~");
				System.out.println("안녕히가세요~");
				
				//3.형식 지정 표준 출력 함수 printf()
				//서식 문자를 이용해서 문자열을 완성시킨 후
				//서식 문자에 들어갈 값을 지정해서 출력하는 방식
				
				int month = 8;
				int day = 22;
				String ani = "오늘 날짜는"; 
				
				System.out.println(ani+month+"월"+day+"일 입니다.");
				
				/*
		        # 포맷팅 서식 문자 종류
		        %d: 부호가 있는 정수 데이터 (decimal)
		        %f: 실수 데이터 (floation point)
		        %s: 문자열 (String)
		        
		        # 탈출 코드 (escape code) -> printf에만 동작하는 게 아니에요.
		        - 반드시 따옴표 내에 위치해야 합니다
		        - 문자열 내에서 특정 명령을 내리고 싶을 때 사용하는 특수 기호입니다.
		        \n: 줄 개행 명령
		        \t: 가로 공백 (스페이스 4칸)
		        */
				

				
				//오늘 날짜는 8월 22일입니다.
				System.out.printf("%s%d월%d일 입니다.\n",ani,month,day);

				
		        //실수를 표현하는 서식문자 %f -> 기본 6자리까지 표현.
		        //%.[자리수를 지정하는 숫자]f -> 원하는 자리수까지 표현.
		        //%라는 문자 자체를 표현할 때는 %% 으로 사용.
				
				double rate = 64.146;
				System.out.printf("합격률은 %.2f%%입니다.",rate);


	}

}
