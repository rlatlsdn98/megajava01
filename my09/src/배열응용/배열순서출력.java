package 배열응용;

import java.util.Scanner;

public class 배열순서출력 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = {66,33,22,11,99};
		System.out.print("입력값 : ");
		int num2 = sc.nextInt();
		for (int i = 0; i < num.length; i++) {
			if (num[i] == num2) {
				System.out.println("위치는 "+(i+1)+"번째 입니다.");
				
			}
		}
			

	}

}
