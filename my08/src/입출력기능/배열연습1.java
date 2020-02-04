package 입출력기능;

public class 배열연습1 {

	public static void main(String[] args) {
		int[] num = new int[10]; 
		// int[] : int로 만들어진 배열 타입
		// num : 배열의 주소가 들어있음, 참조형 
		// new : 복사
		// new int: int변수를 복사 
		// new int[] : int변수 10개 복사
		System.out.println(num); // 주소 확인
		System.out.println(num[0]);
		// 배열은 변수에 초기값을 넣어준다.
		// int배열은 모두 다 0으로 초기값을 가진다.
		
		// 첫번째 위치값을 5로 넣어서 출력
		num[0] = 5;
		System.out.println(num[0]);
		
		// 5번쨰 위치값을 10을 넣어서 출력
		num[4] = 10;
		System.out.println(num[4]);
		
		// 10번쨰 위치값을 20을 넣어서 출력 
		num[9] = 20;
		System.out.println(num[9]);
		
		
	}

}
