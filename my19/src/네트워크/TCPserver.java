package 네트워크;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserver {

	public static void main(String[] args) throws Exception {
		// 승인만을 담당하는 소켓이 있어야 한다.
		// 여결 요청이 들어오면 승인을 하게 된다.
		// 승인한 후, 데이터 전송용 서버가 별도로 만들어진다.
		
		ServerSocket server = new ServerSocket(9100);
		
		while (true) {
			System.out.println("전화기다리는중...");
			Socket socket = server.accept();
			System.out.println("전화 승인 ok....");
		}

	}

}
