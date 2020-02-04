package 크롤링;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버증권크롤링 {

	public static void main(String[] args) throws Exception {
		//모나리자
		String site = "https://finance.naver.com/item/main.nhn?code=005930";
		//네트워크 프로그래밍
		//에러처리
		Connection con = Jsoup.connect(site);
		System.out.println("1.사이트 연결 성공.");
		
		Document doc = con.get();
		System.out.println("2.연결된 사이트에서 문서를 다 가지고 오기 성공.");
		System.out.println("3.내용==================");
		System.out.println(doc);
		
		System.out.println("4.전체문서 중에서 원하는 정보를 추출");
		//pipe연산
		//cal.add().mul().minus()
		System.out.println(doc.select("p.no_today").text());
		System.out.println(doc.select("td.first").text());
		
		
		
		
		
		
		
		
		
	}

}
