package �������̽�_����;

public class MangoCar implements Car{

	@Override
	public void run() {
		System.out.println("�������� �޷���~~");
	}

	@Override
	public void speedUp() {
		System.out.println("�������� 100���� �ӵ��� ������.");
	}

	@Override
	public void speedDown() {
		System.out.println("�������� 30���� �ӵ��� �ٿ���.");
	}

}
