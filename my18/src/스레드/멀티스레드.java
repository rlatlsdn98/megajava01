package 스레드;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

public class 멀티스레드 extends JFrame {
	
	JLabel count = new JLabel("카운트 시작");
	JLabel img = new JLabel("");
	JLabel now = new JLabel("");
	
	public 멀티스레드() {
	
		setTitle("멀티스레드");
		setSize(800, 300);
		getContentPane().setLayout(null);
		
		count.setFont(new Font("굴림", Font.PLAIN, 35));
		count.setBounds(30, 27, 463, 83);
		getContentPane().add(count);
		
		img.setBounds(571, 27, 173, 101);
		getContentPane().add(img);
		
		now.setFont(new Font("굴림", Font.PLAIN, 35));
		now.setBounds(30, 154, 546, 87);
		getContentPane().add(now);
		
		CountThread c = new CountThread();
		c.start();
		
		ImgThread img = new ImgThread();
		img.start();
		
		NowThread now = new NowThread();
		now.start();
		
		setVisible(true);
		
	}
	
	// 내부 클래스(inner class)
	// 전역변수를 공유해서 사용해야하는 경우.
	// 이 클래스는 독립적으로 사용 안된다.
	// 멀티스레드 안에서만 쓸 수 있는 특별한 클래스 
	class CountThread extends Thread{
		
		String[] list = {"1.png","2.png","3.png","4.png","5.png"}; 
		
		@Override
		public void run() {
			for (int i = 0; i < list.length; i++) {
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					
				}
				
				ImageIcon icon = new ImageIcon(list[i]);
				img.setIcon(icon);
				
			} // for
		} // run
	} // inner class
	
	class ImgThread extends Thread{
		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					
				}
				count.setText("카운트 : " + i);
				
			} // for
		} // run
	} // inner class
	
	class NowThread extends Thread{
		@Override
		public void run() {
			for (int i = 0; i < 500; i--) {
				try {
					Thread.sleep(1000);
				} catch (Exception e) {	
				}
				Date date = new Date();
				now.setText(date + "");
				
			} // for
		} // run
	} // inner class

	public static void main(String[] args) {
		멀티스레드 multi = new 멀티스레드();
		

	}
}
