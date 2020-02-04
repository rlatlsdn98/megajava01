package 조건문;

import java.util.Date;

public class 요일처리2 {

	public static void main(String[] args) {
		// switch 문은 편리하지만 수동으로 break를 걸어주어야 함.
		
		Date date = new Date();
		int day = date.getDay(); // 0 = 일요일
		
		switch(day) { // 실수가 올수 없음. 
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saterday");
			break;
		}
		
		

		
			
		
		

	} // main end

} // class end
