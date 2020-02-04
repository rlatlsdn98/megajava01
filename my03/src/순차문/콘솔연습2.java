package 순차문;

import java.util.Scanner;

public class 콘솔연습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 >> ");
		int a = sc.nextInt();
		int NextAge = a + 1;
		System.out.println("내년 나이는 : " + NextAge + "세");

		System.out.print("키를 입력 >> ");
		double height = sc.nextDouble();
		System.out.println("당신의 키는 : " + height + "입니다");

		System.out.print("저녁을 먹었는지 입력(true/false) >> ");
		boolean food = sc.nextBoolean();
		System.out.println("당신의 저녁 여부는 : " + food);

		// 자동 코드정리 : ctrl + shift + f
		
		System.out.print("올해의 목표는 >> ");
		sc.nextLine(); // 엔터 처리
		String life = sc.nextLine(); //한줄다!
		System.out.println("올해의 목표는 " + life);

	}

}
