package java21;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DNSToIp {

	public static void main(String[] args)  {
		String dns = "mgr1.kgitbank.com";
//		String dns = "www.naver.com";
		InetAddress address;
		try {
			address = InetAddress.getByName(dns);
			System.out.println(address);
			System.out.println("ip�ּ� : "+address.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println("������ ������ �������� �ʽ��ϴ�.");
			System.out.println("�ùٸ� �����γ����� �Է����ּ���.");
		}
	}

}
