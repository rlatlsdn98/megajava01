package 상속;

public class 수퍼맨 extends 맨	{
	
	public void 날다() {
		System.out.println("우주를 날아다닌다");
	}

	@Override // 재정의 
	public String toString() {
		return "수퍼맨 [power=" + power + ", gender=" + gender + ", name=" + name + "]";
	}
	

}
