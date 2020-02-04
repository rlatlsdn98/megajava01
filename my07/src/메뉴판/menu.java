package 메뉴판;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu {
	// 선언 ! 의 위치가 변수를 사용할 수 있는 범위
	// 클래스 전체영역에서 쓸 수 있는 변수 : 전역 변수
	static int count = 0; // 음식 주문 수 카운트
	static int jja = 0; // 자장 카운트
	static int jjam = 0; // 짬뽕카운트
	static int man = 0; // 만두 카운트
	static int sum = 0; // 총액
	private static JTextField t2;
	private static JTextField t1;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;
	

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		// 지역 변수		
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("지불할 총 금액 :");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(14, 391, 225, 50);
		f.getContentPane().add(lblNewLabel);
		
		t2 = new JTextField();
		t2.setForeground(Color.RED);
		t2.setBounds(253, 391, 215, 50);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setColumns(10);
		t1.setBounds(352, 12, 116, 50);
		f.getContentPane().add(t1);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("C:\\Users\\82107\\Desktop\\메뉴판.jpg"));
		img.setBounds(14, 131, 454, 257);
		f.getContentPane().add(img);
		
		JButton btnNewButton = new JButton("짜장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				jja++;
				t1.setText(count+"개");
				sum = count * 5000;
				t2.setText(sum + "원");
				t3.setText(jja+"개");
				// 짜장 그림을 img 라벨에 icon 으로 집어 넣어야 함
				ImageIcon icon = new ImageIcon("자장면.jpg");
				img.setIcon(icon);
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 25));
		btnNewButton.setBounds(14, 12, 98, 50);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("짬뽕");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				jjam++;
				t1.setText(count+"개");
				sum = count * 5000;
				t2.setText(sum + "원");
				t4.setText(jjam + "개");
				ImageIcon icon = new ImageIcon("짬뽕.jpg");
				img.setIcon(icon);
			}
		});
		button.setBackground(Color.MAGENTA);
		button.setFont(new Font("굴림", Font.PLAIN, 25));
		button.setBounds(126, 12, 98, 50);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("만두");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				man++;
				t1.setText(count+"개");
				sum = count * 5000;
				t2.setText(sum + "원");
				t5.setText(man+"개");
				ImageIcon icon = new ImageIcon("만두.jpg");
				img.setIcon(icon);
			}
		});
		button_1.setBackground(Color.GREEN);
		button_1.setFont(new Font("굴림", Font.PLAIN, 25));
		button_1.setBounds(238, 12, 98, 50);
		f.getContentPane().add(button_1);
		
		t3 = new JTextField();
		t3.setBounds(14, 69, 98, 50);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(126, 69, 98, 50);
		f.getContentPane().add(t4);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(238, 69, 98, 50);
		f.getContentPane().add(t5);
		
		f.setVisible(true);
		

		

	}

}
