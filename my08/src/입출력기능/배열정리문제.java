package 입출력기능;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		// 10,20,30,40,50을 배열에 넣어 첫번째 값과 두번째 값을 더해서 print
		int[] a = {10,20,30,40,50};
		System.out.println(a[0]+a[1]);
		
		// JAVA, SPRING, JSP를 입력받아 배열에 넣어보세요.
		// 출력은 **JAVA보다는 SPRING**
		Scanner sc = new Scanner(System.in);
		String[] b = new String[3];
		for (int i = 0; i < b.length; i++) {
			System.out.print("입력하시오 : ");
			b[i] = sc.next();
			
		}
		System.out.println("**"+b[0]+"보다는"+" "+b[1]+"**");
		
		int[] c = new int[5];
		for (int i = 0; i < c.length; i++) {
			System.out.print("숫자를 입력하시오 : ");
			c[i] = sc.nextInt();
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		int[] d = {11,22,33,44};
		for (int i = 0; i < d.length; i++) {
			if (d[i]==33) {
				System.out.println("33은 "+ i+1 +"번쨰");
				
			}
		}
		
		
		  

	}

}
