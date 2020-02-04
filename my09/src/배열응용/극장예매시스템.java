package 배열응용;

import java.util.Scanner;

public class 극장예매시스템 {

	public static void main(String[] args) {
		int[] seat = new int[10]; // 좌석의 예매 상황을 저장할 변수
		Scanner sc = new Scanner(System.in);
		
		int count = 0; // 예매한 티켓의 갯수를 카운트
		
		while (true) {
			System.out.println("--------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("--------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("--------------------");
			System.out.print("좌석번호를 입력하시오(종료 : -1) : "); // 좌석번호 입력
			int choice = sc.nextInt();
			// 1. -1을 누른경우
			if (choice == -1) {
				System.out.println("예약 프로그램 종료.");
				System.out.println("당신은" + count + "자리 예매했습니다.");
				System.out.println("당신의 결제금액은 " + (count*10000) + "원 입니다.");
				System.exit(0); // 프로그램 종료
			}
			// 2. 다른 번호를 선택한 경우
			// 좌석번호 0번을 선택!
			// 이미 그 자리가 예매가 완료된 상황(배열의 값이 1)이면 
			// 예매를 못하게 처리를 해야함.
			if (seat[choice] == 1) {
				System.out.println("이미 예매된 자리입니다.");
				System.out.println("다른 좌석을 선택하세요.");
				
			}else {
			seat[choice] = 1; //예매처리
			count++; // 예매한 티켓 갯수 +1 
			System.out.println("예매가 완료되었습니다.");
			}
			System.out.println("");
			
		} // while

	} // main

} // class
