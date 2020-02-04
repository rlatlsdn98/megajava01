package 배열심화;

public class 응용문제 {

	public static void main(String[] args) {
		// 1학기 수학 점수 100, 88, 96
		int[] a = {100, 88, 96};
		// 2학기 수학 점수는 첫 학생만 100점에서 99점으로 변경
		int[] b = a.clone();
		b[0] = 99;
		// 두 학기의 점수를 프린트.
		System.out.print("1학기 수학 점수 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("2학기 수학 점수 : ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
			
		}

	}

}
