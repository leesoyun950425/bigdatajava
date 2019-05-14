package java19;

import java.util.HashMap;

public class MapTest4 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		Border  b1= new Border("aaa","good","kim","1234");
		Border  b2= new Border("bbb","bad","park","4567");
		Border  b3= new Border("ccc","soso","lee","7890");
		map.put("m100", b1);
		map.put("m200", b2);
		map.put("m300", b3);
		System.out.println(map.get("m100"));
		System.out.println(map.get("m200"));
		System.out.println(map.get("m300"));
	}
}
