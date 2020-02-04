package 응용문제;

import java.util.Scanner;

public class 은행결제시스템 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("은행 결제 시스템");
		System.out.println("-----------");
		System.out.println("1)잔고확인 2)입금 3)출금 4)종료 ");

		int money = 10000;
		while (true) { // 조건식에는 반드시 비교연산자를 써준다.비교연산자의 결과는 항상 논리형(true,false)
			System.out.print("선택>> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("당신의 잔고는 : " + money + "원");

			} else if (choice == 2) {
				System.out.print("당신의 입금액>> ");
				int deposit = sc.nextInt();
				money = money + deposit;

			} else if (choice == 3) {
				System.out.print("당신의 출금액>> ");
				int withdraw = sc.nextInt();
				if (withdraw > money) {
					System.out.println("출금불가");
				} else {
					money = money - withdraw;
				}
			} else if (choice == 4 ){
				System.out.println("시스템을 종료합니다.");
				break; // while문 종료!

			} else {
				System.out.println("잘못된 선택");
			}

		} // while

	} // main

} // class
