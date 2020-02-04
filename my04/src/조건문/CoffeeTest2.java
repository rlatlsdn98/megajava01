package 조건문;

import java.util.Date;
import java.util.Scanner;

public class CoffeeTest2 {

	public static void main(String[] args) {
		// 사용할 class들은 처음에 미리 복사한 후에 사용해야함.
		Date date = new Date();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("커피값 : ");
		int price = sc.nextInt();
		
		System.out.print("인원수 : ");
		int people = sc.nextInt();
		
		int now = date.getHours();
		
		if (now >= 22) {	
			System.out.println("커피값 : " + (price * people - 5000));
					
		} else {
			System.out.println("할인없음");

		}
		
		
		
		
		
		


	}

}
