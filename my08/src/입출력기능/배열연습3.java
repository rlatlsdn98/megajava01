package 입출력기능;

public class 배열연습3 {

	public static void main(String[] args) {
		int[] num = new int[10];
		// 각 num 변수 안에는 초기값 0이 들어가있음
		// num[0] = 0;
		// num[1] = 1;
		// num[2] = 2;
		
		//전채 개수를 구해봅시다.
		System.out.println(num.length);
		// 이클립스 에서는 for문을 자동완성할 때
		// 바로 위에있는 배열을 기준으로 만들어준다.
		for (int i = 0; i < num.length; i++) {
			num[i] = i;
		// num[0] = 0
		// num[1] = 1
		
			
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
		}
		
		

	}

}
