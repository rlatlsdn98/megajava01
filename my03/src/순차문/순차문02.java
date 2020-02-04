package 순차문;

import javax.swing.JOptionPane;

public class 순차문02 {

	public static void main(String[] args) {
		String temp = JOptionPane.showInputDialog("현재 온도는?");
		// 모든 외부 입력은 Type은 String!
		// String을 쓸지, Type을 바꿀지는 프로그래머가 결정!
		// String -> int 로 변환
		
		int now = Integer.parseInt(temp); // String temp -> int temp
		
		//처리
		int back = now -1;
		
		//출력
		
		System.out.println("집에 갈때 온도는 " + back + "도");
		JOptionPane.showMessageDialog(null, "집에 갈때 온도는 " + back + "도" );
		
		
		
		

	}

}
