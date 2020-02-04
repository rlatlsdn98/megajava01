package 상속;

// 접근 범위 순서 public > protected > default > private 

public class employee {
	// 접근제어자
	
	public String name; // 아무데서나 name 사용가능
	//기본 제어자 => 같은 패키지!
	String address; // 같은 패키지 내에서만 사용 가능 
					// 상속이라는 패키지 내에서만 사용가능
	protected int sallay; // 같은 + 다른 패키지(상속 했을때만) 사용가능
	private int rrn; // 이 클래스를 벗어날 수 없음. 이 클래스 내에서만 사용 가능
	
	

}
