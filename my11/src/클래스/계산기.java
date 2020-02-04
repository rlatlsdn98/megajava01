package 클래스;

public class 계산기 {
	// 없음 = void 
	public int add(int coffee,int green) {
		System.out.println("결제금액 : " + (coffee + green));
		return coffee + green;
		
	}
	public void minus(int money) {
		boolean vip = true;
		int result = money - 1000;
		System.out.println(result);
		
	}
	public int multi(int a,int b) {
		return a * b;
		
	}
	public void div(int a, int b) {
		System.out.println("1명당 " + a/b + "원");
		
	}

} // class
