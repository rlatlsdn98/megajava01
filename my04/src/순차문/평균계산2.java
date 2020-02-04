package 순차문;

import java.util.Scanner;

public class 평균계산2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("음식점 계산 총 금액 : ");
		int price = sc.nextInt();
		
		System.out.print("함께 먹은 사람 인원 수 : ");
		int people = sc.nextInt();
		
		System.out.println("-------------------------");
		
	    double avg = (double)price/people;
	    // type을 바꾸는 것 : casting
	    
		System.out.println("각자 내야 할 돈 : " + (int)avg + "원");
		
		
		
	}

}
