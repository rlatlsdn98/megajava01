package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 이벤트처리 extends JFrame implements ActionListener {
	
	public 이벤트처리() {
		setTitle("이벤트 처리 연습");
		setSize(300, 300);
		
		JButton b1 = new JButton("나를 눌러요");
		add(b1);
		
		b1.addActionListener(this); // b1 이라는 버튼에 이벤트 처리 기능을 넣는설정.
									// this는 클릭했을 때, 이벤트 처리할 메소드를 가진 객체를 지정
									// 이 클래스가 그 이벤트 처리할 메소드를 가짐.
		setVisible(true);
	}
	public static void main(String[] args) {
		이벤트처리 이 = new 이벤트처리();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼을 눌렀군요");
		

	}

}
