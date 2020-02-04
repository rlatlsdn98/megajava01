package 입출력기능;

public class 배열간단출력 {

	public static void main(String[] args) {
		int[] age = {10,20,30};
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		
		}
		for (int x : age) {
			System.out.println(x);
			
		}
		Double[] eyes = {0.7, 0.9, 1.1, 7.7};
		for (int i = 0; i < eyes.length; i++) {
			System.out.println(eyes[i]);
		}
		for (Double double1 : eyes) {
			System.out.println(double1); 
			
		}

	}

}
