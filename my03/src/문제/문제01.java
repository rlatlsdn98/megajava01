package 문제;

import javax.swing.JOptionPane;

public class 문제01 {

	public static void main(String[] args) {
		// 입력값 : 이름, 소속  출력 : '이름' 은 '소속' 소속입니다.
		
		String name= JOptionPane.showInputDialog("당신의 이름은?");
		String a =JOptionPane.showInputDialog("당신의 소속은?");
		String result = name + " 은(는)" + a + " 소속 입니다.";
		System.out.println(result);

	}

}
