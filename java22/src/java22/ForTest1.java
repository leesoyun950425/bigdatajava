package java22;

public class ForTest1 extends Thread {
	
	@Override
	public void run() { //���ÿ� ó���ǰ� �ϰ���� ������ �� �޼ҵ忡 ����
		for (int i = 0; i < 100; i++) {
			System.out.println("������1--------");
		}
	}
	

}
