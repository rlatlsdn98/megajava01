package 클래스;

public class 우리가족계좌 {

	public static void main(String[] args) {
		bank father = new bank();
		bank mother = new bank();
		bank dauther = new bank();
		
		
		father.name = "홍길동";
		father.account = "튼튼적금";
		father.money = 1000;
		father.입금하다();
		
		mother.account = "튼튼예금";
		mother.money = 2000;
		mother.name = "박길동";
		
		dauther.account = "다음적금";
		dauther.money = 3000;
		dauther.name = "홍기사";
		dauther.출금하다();
		
		System.out.println(father);
		System.out.println(mother);
		System.out.println(dauther);
		
		
		
		

	}

}
