package java21;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		//��Ʈ��ũ ����� ������ �־�� ��.
		DatagramSocket socket = new DatagramSocket();
		//�������� ��Ŷ�� �����Ѵ�.
		String str = "I am a java programer";
		byte[] data = str.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1"); //�ڱ��ڽ��� ��Ÿ���� ���� ip
		DatagramPacket packet = new DatagramPacket(data,data.length,ip,7000);
		
		socket.send(packet);
		socket.close();
	}

}
