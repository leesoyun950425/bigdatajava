package java19;

import java.util.ArrayList;

public class ListTest3 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("���� ��Ʈ��"); 
		//String(��,�۴�) -> Object(��,ũ��)
		//�ڵ�����ȯ, ��ĳ����
		list.add(100);
		System.out.println(list);
		String name = (String)list.get(0);
		//Object(��,ũ��) -> String(��, �ڽ�)
		//��������ȯ, �ٿ�ĳ����
	}

}
