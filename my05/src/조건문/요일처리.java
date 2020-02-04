package 조건문;

import java.util.Date;

public class 요일처리 {

	public static void main(String[] args) {
		// 지금은 몇시인가요??
		// 몇시인지를 알려주는 부품(class)가 필요함.
		Date date = new Date();
		int day = date.getDay(); // 0 = 일요일
		
		if (day == 0) {
			System.out.println("Sunday");
			
		}else if (day == 1) {
			System.out.println("Monday");   
			
		}else if (day == 2) {
			System.out.println("Tuesday");
			
		}else if (day == 3) {
			System.out.println("Wednesday");
			
		}else if (day == 4) {
			System.out.println("Thursday");
			
		}else if (day == 5) {
			System.out.println("Friday");
			
		}else {
			System.out.println("Saterday");
			
		}
		
		

		
			
		
		

	} // main end

} // class end
