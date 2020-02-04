package 배열응용;

public class 배열최소값찾기 {

	public static void main(String[] args) {
		 int[] num = {90,80,20,60,70};
		 
		 //for문을 순회하면서 거기 까지의 최솟값을 넣어두는 변수를 하나 지정!
		 int min = num[1]; // 첫번째 값을 넣어준다 . 현재값은 90
		 
		 for (int i = 0; i < num.length; i++) {
			 if (num[i] < min) {
				 min = num[i];
				 //      90 80 20 60 70
				 //min :    80 20 20 20
			}			
		}
		 System.out.println("최소값은 : " + min);

	}

}
