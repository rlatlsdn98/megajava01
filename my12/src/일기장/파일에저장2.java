package 일기장;

import java.io.FileWriter;
import java.io.IOException;

public class 파일에저장2 {

	public static void main(String[] args) throws Exception {
		// 파일을 인식  + 파일을 저장
		FileWriter file = new FileWriter("20200121.txt");
		file.write("hi.." + "\n");
		file.write("hello.." + "\n");
		file.close(); // 다 썻음.
		
		
		
		
	}

}
