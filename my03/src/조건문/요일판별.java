package 조건문;

import java.util.Scanner;

public class 요일판별 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요일 입력 : 1)주중  2)주말 >> ");
		int date = sc.nextInt();
		if (date == 1) { // 비교 연산자 . 비교 연산자의 결과는 boolean(true/false)
			System.out.println("주중입니다");
			System.out.println("준하는 븅신입니다.");
		} else {
			System.out.println("주말입니다");
			

		}
		

	}

}
