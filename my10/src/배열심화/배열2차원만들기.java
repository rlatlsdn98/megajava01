package 배열심화;

public class 배열2차원만들기 {

	public static void main(String[] args) {
		// 2차원 배열 만들기. (행, 열을 지정해 주어아 햔다.)
		//     0 1 2 3 4 
		// --------------
		// 0 : 0 0 0 0 0
		// 1 : 0 0 0 0 0
		// 2 : 0 0 0 0 0
		
		int[][] seat = new int[3][5];
		System.out.println("배열의 크기 : " + seat.length);
		System.out.println("0번 행의 크기 : " + seat[0].length);
		System.out.println("1번 행의 크기 : " + seat[1].length);
		System.out.println("2번 행의 크기 : " + seat[2].length);
		
		for (int i = 0; i < seat.length; i++) { // 행만큼(3)
			System.out.println();
			for (int j = 0; j < seat[i].length; j++) { // 열만큼(5)
				System.out.print(seat[i][j]+" ");
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
