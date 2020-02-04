package 상속;

public class 수퍼맨사용 {

	public static void main(String[] args) {
		수퍼맨 수퍼 = new 수퍼맨();
		수퍼.gender = "남"; // 사람
		수퍼.name = "클라크"; // 사람
		수퍼.power = 100; // 맨
		
		System.out.println(수퍼);
		
		수퍼.잠자다(); // 사람
		수퍼.먹다(); // 사람
		수퍼.달리기(); // 맨
		수퍼.날다(); // 수퍼맨 
		
		우먼 woman = new 우먼();
		woman.gender = "여";
		woman.name = "홍길동";
		woman.섬세하다();

	}

}
