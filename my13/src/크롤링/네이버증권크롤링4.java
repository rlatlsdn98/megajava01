package 크롤링;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 네이버증권크롤링4 {
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.CYAN);
		f.setSize(429, 695);
		f.getContentPane().setLayout(null);
		
		t1 = new JTextField();
		t1.setForeground(Color.WHITE);
		t1.setBackground(Color.RED);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(171, 280, 198, 64);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JTextArea t2 = new JTextArea();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("Monospaced", Font.BOLD, 35));
		t2.setBounds(48, 428, 320, 186);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("KT&G");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("033780");
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(48, 27, 141, 103);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("삼성전자");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("005930");
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 30));
		button.setBackground(Color.ORANGE);
		button.setBounds(204, 27, 165, 103);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("셀트리온");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("068270");
			}
		});
		button_1.setFont(new Font("굴림", Font.BOLD, 30));
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(204, 140, 165, 103);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("현대차");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setText("005380");
			}
		});
		button_2.setFont(new Font("굴림", Font.BOLD, 30));
		button_2.setBackground(Color.ORANGE);
		button_2.setBounds(49, 140, 141, 103);
		f.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("크롤링시작");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1.코드값을 가지고 온다.
				String code = t1.getText();
				//2.그 코드값으로 크롤링한다.
				try {
					String site = "https://finance.naver.com/item/main.nhn?code=";
					Connection con = Jsoup.connect(site + code);
					Document doc = con.get();
					String date = doc.select("em.date").text();
					// 장마감을 짤라보자!
					String date2 = date.substring(0, 10); // 0~9번까지의 인덱스
					String today = doc.select("span.blind").get(12).text();
					String yesterday = doc.select("span.blind").get(15).text();
					String high = doc.select("span.blind").get(16).text();
					t2.setText("");
					t2.append("날짜: " + date2 + "\n");
					t2.append("오늘: " + today + "\n");
					t2.append("어제: " + yesterday + "\n");
					t2.append("최고: " + high + "\n");
				} catch (Exception e2) {
					System.out.println("에러발생!! 에러발생!!");
				}
				
				
				//3.가져온 크롤링값을 화면에 넣는다.
			}
		});
		button_3.setFont(new Font("굴림", Font.BOLD, 30));
		button_3.setBackground(Color.PINK);
		button_3.setBounds(48, 354, 321, 64);
		f.getContentPane().add(button_3);
		
		JLabel lblNewLabel = new JLabel("코드:");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(50, 292, 109, 52);
		f.getContentPane().add(lblNewLabel);
		f.setVisible(true);
	}
}
