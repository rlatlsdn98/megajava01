package 윈도우;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class 메뉴판 {
	
	static int count = 10; // 도너츠의 개수

	public static void main(String[] args) {
		//큰 프레임을 만들어야 함.
		JFrame f = new JFrame();
		
		//프레임의 크기를 결정해야함.
		f.setSize(500, 500);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\82107\\Desktop\\do.png"));
		f.getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 50));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (count != 0) {
					count--;
					System.out.println("도너츠의 개수는 : " + count + "개");
					f.setTitle("도너츠의 개수 : " + count + "개");
				}else {
					f.setTitle("더이상 뺄수없음");	
				}
				//JOptionPane.showMessageDialog(null, "도너츠 빼기");
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "도너츠 더하기");
				count++;
				System.out.println("도너츠의 개수는 : " + count + "개");
				f.setTitle("도너츠의 개수 : " + count + "개");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 50));
		btnNewButton_1.setBackground(Color.GREEN);
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		//프레임을 보여지게 설정해야함.
		f.setVisible(true);
		
		
		

	} // main

} // class
