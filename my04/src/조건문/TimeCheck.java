package 조건문;

import java.util.Date;

public class TimeCheck {

	public static void main(String[] args) {
		// 실행할 떄 현재 시각을 구해서 얼마나 집에 갈 시간이 남았는지 체크.
		Date date = new Date();
		int hour = date.getHours(); //현재 시간 
		if (hour < 22) {
			// ctrl + alt + 아래화살표 : 한줄복사
			System.out.println("집에 갈 시간이 많이 남았어요.");
			
			
		} else {
			// alt + 화살표 방향 : 이동
			System.out.println("곧 집에 가요.");

		}
		

	}

}
