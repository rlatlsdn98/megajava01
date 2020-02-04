package 일기장;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 파일에저장3 {

	public static void main(String[] args) throws Exception {
		// 파일을 인식  + 파일을 저장
		String name = JOptionPane.showInputDialog("이름 입력 : ");
		String company = JOptionPane.showInputDialog("소속 입력 : ");
		String day = JOptionPane.showInputDialog("날짜 입력 : ");
		
		FileWriter file = new FileWriter(day+".txt");
		file.write(name + "\n");
		file.write(company + "\n");
		file.close(); // 다 썻음.
		
		
		
		
	}

}
