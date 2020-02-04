package 조건문;

public class 성적처리2 {

	public static void main(String[] args) {
		// 점수가 88점
		
		int score = 88;
		
		if (score >= 90) {
			System.out.println("A학점");
			
		}else if(score >= 80){ // if 옆에는 항상 소괄호가 따라오고, 조건을 꼭 써주어야 한다.
			System.out.println("B학점");
			
		}else if(score >= 70) {
			System.out.println("C학점");
			
		}else {
			System.out.println("F학점");
			
		}
		
			
		
		

	} // main end

} // class end
