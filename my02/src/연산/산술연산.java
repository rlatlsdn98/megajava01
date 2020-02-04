package 연산;

public class 산술연산 {

	public static void main(String[] args) {
		
		int n1 = 200; // int 는 -21억 ~ 21억 
		int n2 = 100;
		int n3 = n1 + n2; // n3 = 300
		System.out.println("두 수의 합은 : "+n3);
		
		n3 = n3 + 1; // n3 = 301
		// + 기호 : 연산자 (계산할때 사용하는 기호는 '연산자' 라고 함)
		
		int n4 = n1 - n2; // n1 에서 n2 를 뺀 값을 n4에 저장
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n1 - n2 : " + n4);
		
		int n5 = n1 * n2; // n5 = n1*n2
		System.out.println("n1 * n2 : " + n5);
		
		int n6 = n1/n2; // n6 = n1/n2 몫
		int n7 = n1%n2; // n7 = n1/n2 나머지
		System.out.println("n1/n2 : " + n6);
		System.out.println("n1%n2 : " + n7); 
		
		
		
		

	}

}
