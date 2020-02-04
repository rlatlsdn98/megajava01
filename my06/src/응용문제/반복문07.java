package 응용문제;

import java.util.Scanner;

public class 반복문07{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("    5번 투표 기회가 있음.    ");
		System.out.println("----------------------");
		System.out.println(" 1) 아이유 2) 유재석 3) 공유");
		System.out.println("----------------------");
		int 아이유 = 0;
		int 유재석 = 0;
		int 공유 = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("당신의 선택은? ");
			int choice = sc.nextInt();
			// choice 값에 따라서 다르게 처리
			// 조건문(if, switch)
			switch (choice) {
			case 1:
				아이유++;
				break;
			case 2:
				유재석++;
				break;
			case 3:
				공유++;
				break;
			default:
				System.out.println("1,2,3만 튜표 가능");
				i--; // 잘못 입력시 횟수 인정x
			
			} // switch
			
			
			
			
		} // for
		System.out.println("----------------------");
		System.out.println("아이유 : " + 아이유 + "표");
		System.out.println("유재석 : " + 유재석 + "표");
		System.out.println("공유 : " + 공유 + "표");
		
		

	} // main

} // class
