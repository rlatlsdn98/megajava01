package 생성자;

public class 키보드 {
	String company;
	int price;
	int count;
	
	public 키보드(int p, int co) {
		price = p;
		count = co;
	}
	public 키보드(int p,String c,int co) {
		price = p;
		company = c;
		count = co;
		
	}

	@Override
	public String toString() {
		return "키보드 [company=" + company + ", price=" + price + ", count=" + count + "]";
	}
	
	
	

}
