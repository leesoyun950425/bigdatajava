package java16;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");
		
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i+1+"등 : "+list.get(i));
		}
		list.remove(1);
		
		System.out.println("-----------------------------");
		int size2 = list.size();
		for (int i = 0; i < size2; i++) {
			System.out.println(i+1+"등 : "+list.get(i));
		}
		
	}
}
