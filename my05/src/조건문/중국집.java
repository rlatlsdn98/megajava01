package 조건문;

import java.util.Scanner;

public class 중국집 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사각형의 면적을 구하는 프로그램");
		System.out.println("---------------------");
		int 가로 = 7;
		int 세로 = 8;
		int 면적 = 가로 * 세로;
		
		if (면적 >= 50) {
			System.out.println("너무 넓군요");
			
		} else {
			System.out.println("너무 좁군요");

		}
		
		System.out.println("저기요!!!");
		System.out.println("---------------------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("---------------------");
		System.out.println("1)짜장 2)짬뽕 3)우동 ");
		System.out.println("---------------------");
		System.out.print("당신의 선택은? ");
		int menu = sc.nextInt();
		
		if (menu == 1) {
			System.out.println("당신은 짜장면을 주문하셨습니다.");
			
		}else if (menu == 2) {
			System.out.println("당신은 짬뽕을 주문하셨습니다.");
			
		}else {
			System.out.println("당신은 우동을 주문하셨습니다.");
		}
		

	}

}
