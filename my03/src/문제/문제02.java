package 문제;

import javax.swing.JOptionPane;

public class 문제02 {

	public static void main(String[] args) {
		// 두 수를 입력받아서 더한 후 출력 : '200 + 100 = 300입니다.'
		
		String a = JOptionPane.showInputDialog("수를 입력하시오"); // a 입력
		String b = JOptionPane.showInputDialog("수를 입력하시오"); // b 입력
		
		//처리
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		int e = c + d;
		
		//출력
		JOptionPane.showMessageDialog(null, a + " + " + b + " = " + e + "입니다." );

	}

}
