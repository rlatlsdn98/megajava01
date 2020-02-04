package 입출력기능;

import java.util.Scanner;

public class 여러번입력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int data = 0; // 쓰레기값이 들어가 있는 상태
		// 변수에 처음 값 = 초기값 => 초기화
		int[] data2 = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("성적을 입력하시오 : ");
			data2[i] = sc.nextInt();
			
			
		}
		for (int j = 0; j < data2.length; j++) {
			System.out.print(data2[j]+" ");
			
		}
		
		int sum = 0;
		for (int i = 0; i < data2.length; i++) {
			sum = sum + data2[i];
			
		}
		System.out.println();
		System.out.println("총합은 : "+sum);
		System.out.println("평균은 : "+sum/data2.length);
	}

}
