package 순차문;

import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		//--------------- 나의 현금 잔고--------------
		//현재 당신이 가지고 있는 돈은? 1000
		//내일 당신이 가지게 될 돈은? 2000
		//---------------------------------------
		//내일 내가가지게 될 돈의 총액은 3000
		 
		Scanner sc = new Scanner(System.in); // 콘솔에서 입력 받을수 있는 class를 복사해옴
		
		System.out.println("--------------- 나의 현금 잔고--------------"); 
		
		System.out.print("현재 당신이 가지고 있는 돈은? "); // 모든 입력되는 데이터의 유형(type)은 String!
		int money = sc.nextInt();
		
		System.out.print("내일 당신이 가지게 될 돈은? ");
		int money2 = sc.nextInt();
		
		System.out.println("---------------------------------------");
		
		int sum = money + money2;
		System.out.println("내일 내가 가지게 되 돈의 총액은 " + sum + "원");
		
		
		

	}

}
