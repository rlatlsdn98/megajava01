package 조건문;

import java.util.Date;

public class TimeCheck02 {

	public static void main(String[] args) {
		// crtl + d : 한줄 삭제
		// new (type) 문제 발생시 빨간줄에 마우스 올려서 확인. (F2)
		Date date = new Date();
		
		int hour = date.getHours();
		System.out.println("현재 시간은 " + hour + "시");
		
		int minute = date.getMinutes();
		int sec = date.getSeconds();
		
		System.out.println(minute + "분 " + sec + "초");
		
		int year = date.getYear();
		int year2 = year + 1900;
		System.out.println("올해는 " + year2 + "년");
		
		int month = date.getMonth() + 1;
		System.out.println("이번달은 " + month + "월");
		
		int day = date.getDate();
		System.out.println("오늘은 " + day + "일");
		
		int day2 = date.getDay();
		System.out.println("오늘은 " + day2 + "요일");
		
		if (day == 2) {
			System.out.println("화요일");
			
		}else {
			System.out.println("화요일 아님");
		}
	
	
	
	
	}
}
		
	


