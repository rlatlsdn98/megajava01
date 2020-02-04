package 변수;

public class 데이터2 {

	public static void main(String[] args) {
		// 컴퓨터가 인식하는 데이터는 무엇인가?
		// 기본 데이터
		// 숫자(정수,실수), 문자 1글자, 맞는지여부(논리)
		
		int age = 100; // 등호는 저장공간(변수)에 값을 넣는것.
		double eye = 0.7; // int age = 4.5; 은 오류발생.
		char sn = '1'; //문자 1글자
		boolean coffee = true; // false(거짓)
		
		System.out.println("내 나이는 : "+ age);
		System.out.println("내 시력은 : "+ eye);
		System.out.println("sn : "+ sn);
		System.out.println("coffee : "+ coffee);
		
		//모든 연산은 cpu가 한다.
		System.out.println(age + 1);
		int nextage = age + 1;
		System.out.println("나의 내년 나이는 : "+nextage);
		
		int year; // year라는 변수를 선언! => ram 에 year라는 저장공간이 만들어짐
		year = 2020; // 변수에 값을 대입.
		
		
		
		
		
		
		

	}

}
