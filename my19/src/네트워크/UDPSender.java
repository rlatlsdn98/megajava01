package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket();
		String str = "I am Java Programmer....";
		InetAddress ip = InetAddress.getByName("localhost");
		int port = 7000;
		byte[] data = str.getBytes();
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, port);
		socket.send(packet);
		socket.close();
		

	}

}
