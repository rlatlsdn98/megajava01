package 스레드;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class 카운트다운 extends JFrame {

	JLabel down = new JLabel("");
	JLabel up = new JLabel("");
	
	public 카운트다운() {
		setTitle("카운트다운");
		setSize(500, 500);
		getContentPane().setLayout(null);
		down.setBackground(Color.RED);
		
		down.setFont(new Font("굴림", Font.PLAIN, 99));
		down.setBounds(80, 139, 125, 154);
		getContentPane().add(down);
		up.setBackground(Color.BLUE);
		
		up.setFont(new Font("굴림", Font.PLAIN, 99));
		up.setBounds(251, 139, 132, 154);
		getContentPane().add(up);
		
		DownCount d = new DownCount();
		d.start();
		
		UpCount u = new UpCount();
		u.start();
		
		
		setVisible(true);
		
	}
	
	class DownCount extends Thread{
		@Override
		public void run() {
			for (int i = 10; i >= 0; i--) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				down.setText(i+"");
				
			}// for
		}// run
	}// Thread
	
	class UpCount extends Thread{
		@Override
		public void run() {
			for (int i = 0; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				up.setText(i+"");
				
			}// for
		}// run
	}// Thread
	
	

	public static void main(String[] args) {
		카운트다운 countdown = new 카운트다운();
		
		

	}

}
