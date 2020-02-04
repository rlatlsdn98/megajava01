package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버뮤직크롤링2 {

	public static void main(String[] args) throws Exception {
		// site 지정
		String site = "https://music.naver.com/listen/top100.nhn?domain=TOTAL_V2";
		// Connection 으로 사이트 연결
		Connection con = Jsoup.connect(site);
		// 연결된 사이트에서 문서를 가져오기
		Document doc = con.get();
		// 전체 문서중에서 원하는 정보를 추출.
		System.out.println(doc.select("td._artist").text());

	}

}
