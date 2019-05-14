package java19;

import java.util.ArrayList;

public class ListTest2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("¹Ú¼ÒÁ¤");
		list.add("±èÁ¤¹Î");
		list.add("¼ÒÁöÇö");
		list.add("±è°³³ä");
		list.remove(1);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1+"µî"+list.get(i));
		}
	}
}
