package db;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class 네이버회원가입 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 네이버 회원가입");
		f.getContentPane().setBackground(new Color(50, 205, 50));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setBounds(240, 97, 159, 24);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(240, 143, 159, 24);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(240, 196, 159, 24);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(240, 249, 159, 24);
		f.getContentPane().add(t4);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\82107\\Desktop\\003.png"));
		lblNewLabel.setBounds(121, 12, 227, 79);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디 : ");
		lblNewLabel_1.setBounds(102, 103, 74, 18);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("비밀번호 :");
		label.setBounds(102, 146, 74, 18);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("이름 :");
		label_1.setBounds(102, 199, 74, 18);
		f.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("전화번호 :");
		label_2.setBounds(102, 252, 74, 18);
		f.getContentPane().add(label_2);
		
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				//입력값 가지고 와야함.
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				//DB처리 4단계
				try {
					// 1. 커넥터 설정.
					Class.forName("com.mysql.jdbc.Driver");
					// 2. DB연결 .
					String url = "jdbc:mysql://localhost:3309/shoes";
					String user = "root";
					String password = "1234";
					Connection con = DriverManager.getConnection(url, user, password);
					// 3. SQL문을 만든다.
					String sql = "insert into member values (?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, id);
					ps.setString(2, pw);
					ps.setString(3, name);
					ps.setString(4, tel);
					// 4. SQL문을 mySQL프로그램에 전송.
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "회원가입 완료");
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 35));
		btnNewButton.setBounds(135, 285, 217, 67);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("회원탈퇴");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// 1. 커넥터 설정.
					Class.forName("com.mysql.jdbc.Driver");
					
					// 2. DB연결 .
					String url = "jdbc:mysql://localhost:3309/shoes";
					String user = "root";
					String password = "1234";
					Connection con = DriverManager.getConnection(url, user, password);
					
					// 3. SQL문을 만든다.
					String id = t1.getText();
					String sql = "delete from member where id = ?";
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, id);
					
					// 4. SQL문을 mySQL프로그램에 전송.
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "회원탈퇴 성공");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setFont(new Font("굴림", Font.PLAIN, 35));
		button.setBounds(135, 364, 217, 67);
		f.getContentPane().add(button);
		f.setVisible(true);


	}
}
