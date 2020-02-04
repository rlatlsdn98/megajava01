package 클래스;

public class bank {
	String name;
	String account;
	int money;
	
	public void 입금하다() {
		System.out.println(name + " 입금");
	}
	public void 출금하다() {
		System.out.println(name + " 출금");
	}
	@Override
	public String toString() {
		return "bank [name=" + name + ", account=" + account + ", money=" + money + "]";
	}

	

}
