package 네트워크;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPclient3 {

	public static void main(String[] args) throws Exception, Exception {
		Socket socket = new Socket("localhost",9100);
		System.out.println("TCP Client 3전화함.");

	}

}
