package ����ƽ;

public class �ƺ����� {
	String name;
	int age;
	static int payCount = 1000;
	static int money ;
	static int count;
	static int totalMoney = 10000;
	
	public �ƺ�����() {
	}
	
	public �ƺ�����(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
		money = count * payCount;
	}
	public void play() {
		System.out.print("���..");
	}
	public void watch() {
		System.out.println("TV����.");
	}
}
