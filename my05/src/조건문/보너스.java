package 조건문;

import java.util.Scanner;

public class 보너스 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 직급은? ");
		String rank = sc.next();
		
		switch(rank) {
		
		case "사원" :
			System.out.println("사원의 보너스는 1000만원 입니다.");
			break;
		case "과장" :
			System.out.println("과장의 보너스는 2000만원 입니다.");
			break;
		case "사장" :
			System.out.println("사장의 보너스는 3000만원 입니다.");
			break;
		case "회장" :
			System.out.println("회장의 보너스는 4000만원 입니다.");
			break;
		default:  //위 조건이 아닐떄 처리 내용 , 생략 가능
			System.out.println("직급을 잘못 입력했습니다.");
		}

	}

}
