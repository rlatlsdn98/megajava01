package 클래스;

public class 내방 {

	public static void main(String[] args) {
		// 내 방에 강아지가 한마리가 필요.
		//클래스 객체
		//new를 하면 클래스의 멤버변수들이 ram에 복사가 된다.
		강아지 dog = new 강아지();
		붕어빵틀 붕어빵1 = new 붕어빵틀();
		붕어빵틀 붕어빵2 = new 붕어빵틀();
		스마트폰 폰1 = new 스마트폰();
		
		// 강아지 한마리
		dog.age = 5;
		dog.color = "노랑";
		dog.꼬리를흔들다();
		dog.사람을따른다();
		System.out.println("-----------------------");
		
		//붕어빵1
		붕어빵1.두께 = "두껍게";
		붕어빵1.소 = "팥";
		붕어빵1.붕어빵을먹다();
		붕어빵1.붕어빵을담다();
		
		System.out.println("-----------------------");
		
		//붕어빵2 
		붕어빵2.두께 = "얇게";
		붕어빵2.소 = "크림";
		붕어빵2.붕어빵을담다();
		붕어빵2.붕어빵을먹다();
		
		System.out.println("-----------------------");
		
		//폰1
		폰1.기종 = "GALAXY NOTE10+ 5G";
		폰1.색상 = "SILVER";
		폰1.유튜브시청();
		폰1.전원충전();

	}

}
