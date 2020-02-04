package 조건문;

public class CoffeeTest {

	public static void main(String[] args) {
		int price = 5600;
		int count = 5;
		
		// 25000원이 넘으면 5000원 할인.
		// 아니면 그냥 다 냄.
		
		int sum = price * count;
		
		if (sum >= 25000) {
			sum = sum - 5000;
			System.out.println("총액은 " + sum + "입니다.");
			
		} else { // 비워두어도 됨.
			System.out.println("총액은 " + sum + "입니다.");

		}
		
		int now = 21;
		if (now < 22) {
			System.out.println("많이남았다");
			
		} else {
			System.out.println("곧 끝난다");

		}
		
		
		
		


	}

}
