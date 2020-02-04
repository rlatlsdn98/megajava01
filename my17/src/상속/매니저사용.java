package 상속;

public class 매니저사용 {

	public static void main(String[] args) {
		manager m = new manager();
		m.name = "홍길동"; //public
		m.address = "여의도"; // default
		m.sallay = 100; // protected
		// rrn 은 같은 패키지여도 접근 불가능
		

	}

}
