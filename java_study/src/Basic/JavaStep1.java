package Basic;

public class JavaStep1 {

	public static void main(String[] args) {
		
		//1.식별자의 이름은 중복을 허용하지 않음.
		//대, 소문자를 확실하게 구분해야함.
		
		int age =35; //데이터 타입 int 변수명 age 데이터 35라는 정수
		System.out.println(age); //변수 age를 출력함
		
		//2.식별자의 이름은 숫자로작성하거나 처음시작을 숫자로
		//설정 할 수 없다.
		// int 365 = 365;(x)
		int all = 365;
		System.out.println(all);
		
		//3.식별자 이름에 공백을 넣을 수 없음.
		//int today is good = 22; (x)
		int todayIsGood = 22;
		System.out.println(todayIsGood);
		//단어가 합쳐진 변수명은 camel case표기법으로 표기한다.
		
		//4.식별자에 쓸 수 있는 특수문자는 밑줄(_),달러기호(&)뿐
		//사용할 수 있지만 권장하진 않음
		//위의 특수문자들은 약속된 곳이 정해져있음.
		String $hello_ = "인사";
		System.out.println($hello_);
		
		//5.키워드(예약어)는 식별자 이름으로 사용불가능
		//키워드란 이미 어떠한 내용을 내포하는 지정문자임
		//String class = "클래스";(x)
		String Class = "클래스"; 
		//대문자로 변경하여 사용가능하지만 헷갈릴 수 있으므로 사용안함
		
		//6.한글, 한자등으로도 식별자 지정이 가능하나
		//대부분 코드들은 영어를 사용하므로 사용하지말자.
		
	}

}
