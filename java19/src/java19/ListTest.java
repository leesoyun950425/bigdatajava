package java19;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("���� ��Ʈ��");
		list.add(100);
		//int --> Integer --> Object
		//  (boxing)    (upcasting)
		//int ---> Integer (auto-boxing) boxing = �������� Ŭ������ ��ȯ�Ǵ°�
		//int <--- Integer (auto-unboxing)
		
		int num = (Integer)list.get(1);
		
		list.add(11.22);
		list.add(true);
		MemberDTO dto = new MemberDTO("java","java","java","java");
		list.add(dto);
		list.remove(3);
		System.out.println(list);
	}
}
