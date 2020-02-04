package 배열응용;

import javax.swing.JOptionPane;

public class 평균나이배열 {

	public static void main(String[] args) {
		// 우리 가족의 나이를 JoptionPane 으로 입력받아서, 평균 나이를 구해보세요.
		
		String[] ages = new String[4];
		Double sum = 0.0;
		for (int i = 0; i < ages.length; i++) {
			ages[i] = JOptionPane.showInputDialog("가족의 나이를 입력하세요 : ");
			sum = sum + Integer.parseInt(ages[i]);
		}
		System.out.println("우리가족 평균 나이는 " + sum/ages.length);

	}

}
