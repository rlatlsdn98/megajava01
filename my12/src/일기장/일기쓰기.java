package 일기장;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class 일기쓰기 {
	private static JTextField t1;
	private static JTextField t2;

	public void diary() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 20));
		t1.setBounds(236, 24, 216, 53);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 20));
		t2.setColumns(10);
		t2.setBounds(236, 97, 216, 53);
		f.getContentPane().add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setRows(5);
		t3.setColumns(20);
		t3.setBounds(236, 178, 216, 187);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜 :");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel.setBounds(25, 24, 161, 53);
		f.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("오늘의 제목 :");
		label.setFont(new Font("굴림", Font.PLAIN, 25));
		label.setBounds(25, 97, 161, 53);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("오늘의 내용 :");
		label_1.setFont(new Font("굴림", Font.PLAIN, 25));
		label_1.setBounds(25, 189, 161, 53);
		f.getContentPane().add(label_1);
		
		JButton btnNewButton = new JButton("저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. 입력한 값 가지고 오기
				String day = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				// 2. 파일에 저장하기
				try {
					FileWriter f = new FileWriter(day+".txt");
					f.write(title+"\n");
					f.write(content+"\n");
					f.close();
					JOptionPane.showMessageDialog(null, "저장완료");
				} catch (IOException e1) {
					System.out.println("파일저장중에러발생.");
				}
				// 3. 저장후에 확인메세지 뿌리기
				
				
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 48));
		btnNewButton.setBounds(41, 270, 130, 95);
		f.getContentPane().add(btnNewButton);
		f.setTitle("오늘의 일기");
		f.setSize(500, 500);
		f.setVisible(true);

	}
}
