package java19;

public class ����ȯ�׽�Ʈ1 {

	public static void main(String[] args) {
		//����ȯ(type change : Ÿ�Ժ�ȯ, casting, ĳ����)
		//������ ����ȯ
		//��->ū : �ڵ�����ȯ
		byte a = 127;
		int b = a;
		
		//ū->�� : ��������ȯ
		int c = 127;
		byte d = (byte)c;
		
		//������ ����ȯ(Ŭ������ ����ȯ)
		//��Ӱ��迡 �ִ� Ŭ�����鸸 ����ȯ ����
		//��(�ڽ�)->ū(�θ�) : �ڵ�����ȯ(��ĳ����)
//		Car car = new Car(); //�θ�(ũ��)
//		Truck truck = new Truck(); //�ڽ�(�۴�)
//		car = truck; //(ūCar = ����Truck)
//		
		//ū(�θ�)->��(�ڽ�) : ��������ȯ(�ٿ�ĳ����)
//		truck = (truck)car; //(����Truck = ū Car)
	}

}
