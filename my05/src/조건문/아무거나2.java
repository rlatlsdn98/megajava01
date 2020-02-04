package 조건문;

import java.util.Random;
import java.util.Scanner;

public class 아무거나2 {

	public static void main(String[] args) {
		// 아무거나 내게 하는 class
		// 랜덤(random) 클래스
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int data = random.nextInt(3); // 0 ~ 2
		// 0 ~ 2 까지 발생시킴.
		System.out.print("0)가위 1)바위 2)보 ");
		int me = sc.nextInt();
		
		switch(me){
		case 0: //내가 바위를 냄 . 컴퓨터의 결과에 따라 달라짐
			switch(data){
			case 0:
				System.out.println("computer는 가위를 냄.");
				System.out.println("무승부");
				break;
			case 1:
				System.out.println("computer는 바위를 냄.");
				System.out.println("computer 승리");
				break;
			case 2:
				System.out.println("computer는 보자기를 냄.");
				System.out.println("me 승리");
				break;
			}
			break;
		case 1:
			switch(data){
			case 0:
				System.out.println("computer는 가위를 냄.");
				System.out.println("me 승리");
				break;
			case 1:
				System.out.println("computer는 바위를 냄.");
				System.out.println("무승부");
				break;
			case 2:
				System.out.println("computer는 보자기를 냄.");
				System.out.println("computer 승리");
				break;
			}
			break;
		case 2:
			switch(data){
			case 0:
				System.out.println("computer는 가위를 냄.");
				System.out.println("computer 승리");
				break;
			case 1:
				System.out.println("computer는 바위를 냄.");
				System.out.println("me 승리");
				break;
			case 2:
				System.out.println("computer는 보자기를 냄.");
				System.out.println("무승부");
				break;
			}
			break;

		}
		
		
		
	} // main

} // class
