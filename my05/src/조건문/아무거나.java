package 조건문;

import java.util.Random;

public class 아무거나 {

	public static void main(String[] args) {
		// 아무거나 내게 하는 class
		// 랜덤(random) 클래스
		Random random = new Random();
		int data = random.nextInt(3); // -21억 ~ 21억 
		// 0 ~ 2 까지 발생시킴.
		
		System.out.println(data);
	}

}
