package Basic;

import java.util.Scanner;

public class JavaIf02 {

	public static void main(String[] args) {
		
		//나이를 입력하고 각 나이별 연령대를 출력하시오
		//20~39 청년 40세~60-중년 61 ~ 노년
		// 이하 17~ 고등학생 14~ 중학생 8~초등학생 이하 미취학 아동

		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하십시오: ");
		int age = sc.nextInt();
		
		if(age >= 61) {
			System.out.println("노년");
		}else if(age >= 40) {
			System.out.println("중년");
		}else if(age >= 20) {
			System.out.println("청년");
		}else if(age >=17) {
			System.out.println("고등학생");
		}else if(age >=14) {
			System.out.println("중학생");
		}else if(age >=8) {
			System.out.println("초등학생");
		}else {
			System.out.println("미취학 아동");
		}
		
		sc.close();
		
	}

}
