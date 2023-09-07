package Basic;

import java.util.Scanner;

public class JavaIf {

	public static void main(String[] args) {
		/*
		 점수를 입력받아 70이상이면 합격
		 70미만이면 불합격으로 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("점수를 입력하시면 합격 여부가 보여집니다.");
		System.out.print("점수: ");
		int point = sc.nextInt(); 
		
		if(point >= 70) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
		System.out.println("----------------------");
		System.out.println("내 점수: "+point);
		System.out.println("수고하셨습니다.");
		
		
		sc.close();

	}

}
