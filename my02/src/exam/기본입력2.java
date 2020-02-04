package exam;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 기본입력2 {

	public static void main(String[] args) throws IOException {
		// 두개를 입력받아서 두개를 결합시켜 그 결합 결과를 출력
		String a = JOptionPane.showInputDialog("입력하시오");
		String b = JOptionPane.showInputDialog("입력하시오");
		String c = a + b;
		
		//System.out.println(c);
		//JOptionPane.showMessageDialog(null, c);
		
		FileWriter file = new FileWriter("win.txt");
		file.write(c);
		file.close();
		
		
	}

}
