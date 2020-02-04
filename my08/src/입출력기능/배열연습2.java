package 입출력기능;

public class 배열연습2 {

	public static void main(String[] args) {
		// int 배열 100개를 만들어서 첫번째 값은 1 50번째는 11  77번째 111  마지막  1111
		int[] num = new int[100];
		num[0] = 1;
		num[49] = 11;
		num[76] = 111;
		num[99] = 1111;
		System.out.println(num[0]);
		System.out.println(num[49]);
		System.out.println(num[76]);
		System.out.println(num[99]);

	}

}
