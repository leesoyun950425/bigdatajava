package java19;

import java.util.HashMap;

public class MapTest2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(100, "�赥��");
		map.put(200, "�����");
		map.put(300, "�豸��");
		map.put(400, "���ڷ�");
		System.out.println(map);
		map.remove(200);
		map.replace(300, "���漺");
		System.out.println(map);
	}
}
