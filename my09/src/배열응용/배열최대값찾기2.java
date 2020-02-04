package 배열응용;

public class 배열최대값찾기2 {

	public static void main(String[] args) {
		 int[] num = {90,80,20,60,70};
		 
		 int max = num[0];
		 for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
				
			}
		}
		 System.out.println("최대값은 : " + max);

	}

}
