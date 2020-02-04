package 스태틱;

public class Tv사용 {

	public static void main(String[] args) {
		Tv t1 = new Tv("검정",1000000);
		System.out.println(t1.count);
		
		Tv t2 = new Tv("하양",5000000);
		System.out.println(t2.count);
		
		System.out.println(t1);
		System.out.println(t2);

	}

}
