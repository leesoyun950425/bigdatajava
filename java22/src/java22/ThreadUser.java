package java22;

public class ThreadUser {
	public static void main(String[] args) {
		ForTest1 t1 = new ForTest1(); //������ ��ü ����
		ForTest2 t2 = new ForTest2();
		ForTest3 t3 = new ForTest3();
		
		t1.start();  //CPU �����·� 
		t2.start();
		t3.start();
	}
}
