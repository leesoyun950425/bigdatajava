package string�׽�Ʈ;

import java.util.Random;

public class MathTest {

	public static void main(String[] args) {
		System.out.println(Math.random());
		int num = (int)(Math.random()+10);
		System.out.println(num);
		
		double num2 = 12345.4789;
		System.out.println(Math.ceil(num2));
		System.out.println(Math.floor(num2));
		System.out.println(Math.round(num2));
		
		final double NUM = 1000;
//		NUM = 2000; //���� �Ұ�.
		//����� �ѹ� �־�ΰ� ������ �ʾƾ� �ϴ� 
		//�����͸� �־�� �� ���.
		//����� final�� Ű���带 ���.
		//����� �� �����ʹ� ���� �Ұ�.
		//�Ϲ� ������ ���ϱ� ���� �빮�ڷ� ��δ� ���� �Ϲ���
		
		int num3 = -100;
		System.out.println(Math.abs(num3));
		
		int num4 = -200;
		System.out.println(Math.max(num3, num4));
		System.out.println(Math.min(num3, num4));
		int num5 = 3;
		System.out.println(Math.pow(num5, 3));
		System.out.println(Math.sqrt(num5));
		
		Random r = new Random();
		r.setSeed(100);
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(100));
		}
	}

}
