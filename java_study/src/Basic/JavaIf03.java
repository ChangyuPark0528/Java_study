package Basic;

import java.util.Scanner;

public class JavaIf03 {

	public static void main(String[] args) {
				
		/*
		 키를 입력 후 140cm이상이면 나이를 입력받아주세요.
		 나이가 8세 이상이면 탑승가능 8세미만 6세이상이면 보호자 동반시 탑승가능 출력
		 키가 140미만이라면 바로 탑승불가 출력 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요(cm): ");
		int height = sc.nextInt();
		
		if(height >= 140 ) {
			System.out.print("나이를 입력하세요: ");
			int age = sc.nextInt();
			
			if(age >= 8 ){
				System.out.println("탑승 가능합니다.");
			}else if(age >= 6) {
				System.out.println("보호자 동반시 탑승가능합니다.");
			}else {
				System.out.println("나이가 6세 미만입니다.");
				System.out.println("놀이기구 탑승이 불가합니다.");
			}
		}else {
			System.out.println("탑승이 불가능합니다.");
		}
		
		sc.close();
		
	
	}

}
















