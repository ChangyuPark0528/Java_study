package Basic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		
		/*
		 # 2차원 배열
		 -배열 안에 배열이 존재하는 형태를 2차원 배열이라고 합니다.
		 -실제 배열에는 배열의 주소값이 들어가게 됩니다.
		 */
		
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println(Arrays.deepToString(arr));//배열 전체를 한번에 볼 수 있음
		
		System.out.println("------------------------------");
		
		//빈 2차원 배열 만들기
		int[][] arr2 = new int[10][5]; //비어있는 새로운 배열 10개안에 5개짜리 배열을 생성
		
		arr2[1][2] = 50;
		arr2[0][1] = 50;
		arr2[1][1] = 50;
		
		for(int[] n : arr2) {
			for(int t: n) {
				System.out.print(t + " ");
			}
			System.out.println();
		}
		

	}

}
