package 일기장;

import java.io.File;

public class 파일에저장 {

	public static void main(String[] args) {
		// 20200121.txt
		File file = new File("C:/my/readme.txt");
		boolean ex = file.exists();
		System.out.println("존재여부  : " + ex);
		System.out.println("폴더여부 : " + file.isDirectory());
		System.out.println("파일여부 : " + file.isFile());
		System.out.println("위치확인 : " + file.getPath());
		
		System.out.println();
		
		File file2 = new File("c:/windows");
		String[] list = file2.list();
		int folderCount = 0;
		int fileCount = 0;
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
			File file3 = new File("c:/windows/" + list[i]);
			if (file3.isFile()) {
				fileCount++;
				
			}else {
				folderCount++;
			}
			
		}
		System.out.println("폴더의 개수는 " + folderCount);
		System.out.println("파일의 개수는 " + fileCount);
		
		

	}

}
