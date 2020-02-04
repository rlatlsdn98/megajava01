package 순차문;

import java.util.Scanner;

public class money2 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in); // 콘솔에서 입력 받을수 있는 class를 복사해옴
		 
		 System.out.println("  << 여행 정보 >>  ");
		 System.out.println("----------------");
		 
		 System.out.print("- 여행지 : ");
		 String place = sc.next();
		 
		 System.out.print("- 경비 : ");
		 int price = sc.nextInt();
		 
		 System.out.print("- 할인률 : ");
		 double discount = sc.nextDouble();
		 
		 System.out.print("- 실제 경비 : ");
		 double realPrice = price - price * discount; // 자바에서 연산할 때 하나라도 실수(double)가 들어있으면 결과는 실수!, 정수와 정수연산의 결과는 정수!
		 System.out.println((int)realPrice + "원");
		 
		 System.out.println("----------------");
		 
		 System.out.println("=> 12월 중순에 갔을 때 가격");
		 
		 
		
		
		
		
		

	}

}
