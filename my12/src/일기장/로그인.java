package 일기장;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(38, 23, 395, 245);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\82107\\Desktop\\diary.png"));
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID : ");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel_1.setBackground(Color.YELLOW);
		lblNewLabel_1.setBounds(160, 301, 75, 40);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setFont(new Font("굴림", Font.PLAIN, 30));
		lblPassword.setBackground(Color.YELLOW);
		lblPassword.setBounds(26, 353, 222, 34);
		f.getContentPane().add(lblPassword);
		
		t1 = new JTextField();
		t1.setBounds(237, 301, 136, 38);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(237, 353, 136, 34);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				String pw = t2.getText();
				if (id.equals("root")&&pw.equals("1234")) {
					// 일기쓰러 감. => diary 메소드가 필요.
					일기쓰기 today = new 일기쓰기();
					today.diary();
					f.hide(); // 로그인 성공하면 윈도우 나
					// diary() 메소드를 쓰고싶으면 , 이 메소드를 쓸수있는 주소를 가진 변수만 있으면 됨.					
				}else {
					// 경고메세지.
					JOptionPane.showMessageDialog(null, "id,pw 잘못 입력.");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\82107\\Desktop\\001.png"));
		btnNewButton.setBounds(59, 399, 125, 122);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ID , PASSWORD를 공백으로 초기화
				t1.setText("");
				t2.setText("");
				
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\82107\\Desktop\\002.png"));
		button.setBounds(308, 399, 125, 122);
		f.getContentPane().add(button);
		f.setTitle("나의 일기장");
		f.setSize(507, 594);
		f.setVisible(true);
				



	}
}
