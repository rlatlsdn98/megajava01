import java.util.Arrays;

public class 등수확인문제 {

	public static void main(String[] args) {
		int[] score = {50,80,70,60,40};
		int me = 70;
		Arrays.sort(score); // 정렬
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i] + " ");
		}
		
		
		
		for (int i = 0; i < score.length; i++) {
			if (score[i]==me) {
				System.out.println("내 등수는 " + (score.length - i) + "등");
				
			}
		}

	}

}
