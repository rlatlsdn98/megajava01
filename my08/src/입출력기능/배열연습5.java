package 입출력기능;

public class 배열연습5 {

	public static void main(String[] args) {
		//친구 이름
		String[] names = {"홍길동","김길동","박길동","남길동","황길동"};
		// 우리가족 5명의 나이를 넣어보세요. 전체 출력
		int[] ages = {15,25,35,45,55};
		// 친구들의 발 사이즈를 넣어보세요 . 전체출력
		int[] shoesize = {155,255,355,455,555};
		// 친구들의 성별을 넣어보세요. 전체출력
		char[] gender = {'남','여','남','여','남'};
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]+" ");
			System.out.print(ages[i]+" ");
			System.out.print(shoesize[i]+" ");
			System.out.print(gender[i]+" ");
			System.out.println("");
			
		}
		
		
		
	}

}
