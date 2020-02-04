package 배열응용;

import java.util.Random;

public class 여러개중최대값찾기 {

	public static void main(String[] args) {
		
		Random r = new Random();
		// 씨앗값을 심는다.
		// random 값들을 동일하게 나오게 한다.
		int[] num = new int[100];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(100);
		}
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		System.out.println("배열의 최대값은 : " + max);
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == max) {
				count++;
				System.out.println("max값이 들어있는 자리는 : " + i);
			}
		}
		System.out.println(max + "의 갯수는" + count + "개");

	}

}
