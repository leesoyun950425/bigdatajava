package ����ƽ;

public class �ε� {
	public static void main(String[] args) {
		�ƺ����� father = new �ƺ�����();
		�ƺ����� m1 = new �ƺ�����("��ƹ���1",15);
		�ƺ����� m2 = new �ƺ�����("��ƹ���2",5);
		
		System.out.println("�� ���� �� ���� �뵷�� ��"+�ƺ�����.money+"�� ���������.");
		System.out.println("�� ���� �̸��� : " +m1.name+"�� "+m2.name );
		System.out.print("�� ���� ���� ");
		father.play();
		father.watch();
		System.out.println("�ƺ� �������� "+(�ƺ�����.totalMoney-�ƺ�����.money)+"�� ���Ҿ��.");
	}
}
