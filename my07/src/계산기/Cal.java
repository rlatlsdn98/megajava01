package 계산기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cal {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField result;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(556, 555);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\82107\\Desktop\\계산기.png"));
		lblNewLabel.setBounds(139, 24, 245, 103);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(89, 169, 62, 36);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("숫자1");
		label.setFont(new Font("굴림", Font.PLAIN, 25));
		label.setBounds(89, 237, 62, 36);
		f.getContentPane().add(label);
		
		t1 = new JTextField();
		t1.setBounds(177, 173, 185, 30);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(177, 243, 185, 30);
		f.getContentPane().add(t2);
		
		result = new JTextField();
		result.setBounds(197, 444, 165, 24);
		f.getContentPane().add(result);
		result.setColumns(10);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1 과 t2 의 입력값을 가지고 온다
				String t11 = t1.getText();
				String t22 = t2.getText();
				// t1 과 t2의 type을 int 로 변환
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				// 두 수를 더한다
				// 더한 결과를 result에 넣어줌
				int add = t111 + t222;
				String add2 = String.valueOf(add); // int 를 string 으로 변환
				// 결과 화면에 result를 출력
				result.setText(add2);
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 25));
		btnNewButton.setBounds(14, 366, 115, 50);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("빼기");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				String t22 = t2.getText();
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				int minus = t111 - t222;
				String minus2 = String.valueOf(minus);
				result.setText(minus2);
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 25));
		button.setBounds(146, 366, 115, 50);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("나누기");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				String t22 = t2.getText();
				Double t111 = Double.parseDouble(t11);
				Double t222 = Double.parseDouble(t22);
				Double division = t111/t222;
				String division2 = String.valueOf(division);
				result.setText(division2);
				
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 25));
		button_1.setBounds(275, 366, 115, 50);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("곱하기");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t11 = t1.getText();
				String t22 = t2.getText();
				Double t111 = Double.parseDouble(t11);
				Double t222 = Double.parseDouble(t22);
				Double multiple = t111*t222;
				String multiple2 = String.valueOf(multiple);
				result.setText(multiple2);
			}
		});
		button_2.setFont(new Font("굴림", Font.PLAIN, 25));
		button_2.setBounds(404, 366, 115, 50);
		f.getContentPane().add(button_2);
		
		JLabel lblNewLabel_2 = new JLabel("결과화면 :");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(74, 428, 125, 48);
		f.getContentPane().add(lblNewLabel_2);
		
		f.setVisible(true);
		
		

	}

}
