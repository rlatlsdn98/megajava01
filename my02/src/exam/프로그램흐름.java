package exam;

import javax.swing.JOptionPane; //jop + (ctrl + space bar). -> showi(ctrl + space bar)

public class 프로그램흐름 {

	public static void main(String[] args) {
		String company = JOptionPane.showInputDialog("당신의 소속은?");
		String b = company + "스터디";
		System.out.println("당신의 소속은 "+ b);
//		프로그램의 흐름
//		데이터 입력 -> 처리 -> 결과 출력!
//
//
//		입력) 당신의 소속은? -> 메가
//		처리) 메가 + 스터디 임이의 변수에 대입
//		출력) 2번의 변수 내용을 콘솔에 출력.

		// 자동 주석 : ctrl + /		


	}

}
