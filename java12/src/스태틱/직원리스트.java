package ����ƽ;

public class ��������Ʈ {
	public static void main(String[] args) {
		WokerTest wk1 = new WokerTest("�Ӿƹ���",'��',24);
		WokerTest wk2 = new WokerTest("��ƹ���",'��',23);
		WokerTest wk3 = new WokerTest("�ھƹ���",'��',25);
		
		System.out.println("��ü ���� ��? " + WokerTest.woker);
		System.out.println("�������� ��� ����? "+WokerTest.ageTotal/WokerTest.woker);
		
		System.out.println("��ü ���� ����Ʈ ");
		System.out.println(wk1);
		System.out.println(wk2);
		System.out.println(wk3);
	}
}
