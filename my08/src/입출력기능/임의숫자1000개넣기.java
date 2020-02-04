package 입출력기능;

import java.util.Random;

public class 임의숫자1000개넣기 {

	public static void main(String[] args) {
		// 로또 숫자 6개 만들기
		int[] lotto = new int[1000];
		
		// 아무거나 발생해주는 부품(class) 필요
		Random r = new Random();
		//int data = r.nextInt(46); // 0 ~ 45
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(1000);			
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]+" ");
		}
		
		
		

	}

}
