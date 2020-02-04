package 조건문;

import java.util.Date;

public class 인사처리 {

	public static void main(String[] args) {
		// 지금은 몇시인가요??
		// 몇시인지를 알려주는 부품(class)가 필요함.
		Date date = new Date();
		int hour = date.getHours();
		
		// 지금 단계에서는 if~else if~else
		// 복잡한 if~else문을 정리해서 만드는 법 
		if (hour >= 6 && hour < 10) {
			// 논리연산자 
			// 여러가지 조건을 만족해야하는 경우는 
			// and 연산자 : &&
			
			// 여러가지 조건 중 하나만 만족해도 되는 경우는
			// or 연산자 : ||
			System.out.println("Good Morning");
			
		}else if (hour < 15) {
			System.out.println("Good Afternoon");
			
		}else if (hour < 22) {
			System.out.println("Good Evening");
		}else {
			System.out.println("Good night");
		}
		

		
			
		
		

	} // main end

} // class end
