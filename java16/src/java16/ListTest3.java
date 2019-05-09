package java16;

import java.util.ArrayList;

public class ListTest3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("김데이");
		list.add("김사전");
		list.add("김구조");
		list.add("김자료");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)*100 + "번 고객 : " +list.get(i));
		}
		System.out.println("---------------------------");
		list.remove(1);
		list.set(1, "김충성");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)*100 + "번 고객 : "+list.get(i));
			
		}
	}
}
