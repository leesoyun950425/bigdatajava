package java19;

import java.util.HashSet;

public class SetTest3 {
	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		set1.add("���");
		set1.add("����");
		set1.add("�ٳ���");
		HashSet set2 = new HashSet();
		set2.add("��");
		set2.add("���÷�");
		set2.add("���̽�ũ��");
		set1.addAll(set2);
		System.out.println(set1);
		System.out.println(set2);
		set2.clear();
		System.out.println(set2);
	}
}
