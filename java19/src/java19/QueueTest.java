package java19;

import java.util.LinkedList;

public class QueueTest {
	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("��������");
		milk.add("���ÿ���");
		milk.add("���Ͽ���");
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
	}
}
