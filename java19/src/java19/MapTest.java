package java19;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap phone = new HashMap();
		phone.put(1, "����");
		phone.put(2, "�ƺ�");
		phone.put(3, "����");
		phone.put(4, "ģ��");
		System.out.println(phone);
		System.out.println(phone.get(1));
	}

}
