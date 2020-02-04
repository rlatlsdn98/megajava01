package 입출력기능;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Me {
	private static JTextField name;
	private static JTextField age;
	private static JTextField shoe;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel.setBounds(41, 76, 50, 42);
		f.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("나이");
		label.setFont(new Font("굴림", Font.PLAIN, 25));
		label.setBounds(43, 160, 50, 42);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("신발");
		label_1.setFont(new Font("굴림", Font.PLAIN, 25));
		label_1.setBounds(45, 249, 50, 42);
		f.getContentPane().add(label_1);
		
		name = new JTextField();
		name.setBackground(Color.GREEN);
		name.setBounds(170, 86, 118, 25);
		f.getContentPane().add(name);
		name.setColumns(10);
		
		age = new JTextField();
		age.setColumns(10);
		age.setBackground(Color.GREEN);
		age.setBounds(172, 168, 118, 25);
		f.getContentPane().add(age);
		
		shoe = new JTextField();
		shoe.setColumns(10);
		shoe.setBackground(Color.GREEN);
		shoe.setBounds(171, 255, 118, 25);
		f.getContentPane().add(shoe);
		
		JButton btnNewButton = new JButton("출력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = name.getText();
				if (n.equals("")||n.equals("다시입력")) {
					name.setText("다시입력");
				}else {					
					System.out.println("이름 출력 : " + n + "님");
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 25));
		btnNewButton.setBounds(324, 84, 105, 35);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("출력");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = age.getText();
				//내년 나이를 구해서, 나이 출력 아래에 넣어보기
				int b= Integer.parseInt(a);
				System.out.println("나이 출력 : " + a + "세");
				System.out.println("내년 나이는 : "+ (b+1) + "세");
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 25));
		button.setBounds(328, 160, 105, 35);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("출력");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = shoe.getText();
				System.out.println("신발 사이즈 출력 : "+ s);
			}
		});
		button_1.setFont(new Font("굴림", Font.PLAIN, 25));
		button_1.setBounds(328, 243, 105, 35);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("모두출력");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = name.getText();
				String a = age.getText();
				String s = shoe.getText();
				System.out.println("이름 : "+ n +" 나이 : "+ a + " 신발 사이즈 : " + s );
			}
		});
		button_2.setFont(new Font("굴림", Font.PLAIN, 25));
		button_2.setBounds(163, 349, 142, 35);
		f.getContentPane().add(button_2);
		f.setSize(500, 500);  // ' . ' 연산자 : 접근 연산자(~에)
		f.setVisible(true); // 제일 밑으로 와야 전부 출력됨. 
		

	} // main
} // class
