package 캐스팅;

public class 기본형캐스팅 {

	public static void main(String[] args) {
		byte a = 100; // 1바이트
		int b = 120; // 4바이트
		b = a; // 작은것 -> 큰것 : 큰것으로 자동 변환해서 들어간다.
			   // byte -> int(자동형변환)
		//형변환 = 캐스팅(casting)
		
		a = (byte)b; // 큰것 -> 작은것 : 작은것으로 강제 변환해서 들어간다.
			   		 // int -> byte(강제형변환)
		
		
		

	}

}
