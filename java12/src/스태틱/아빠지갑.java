package ½ºÅÂÆ½;

public class ¾ÆºüÁö°© {
	String name;
	int age;
	static int payCount = 1000;
	static int money ;
	static int count;
	static int totalMoney = 10000;
	
	public ¾ÆºüÁö°©() {
	}
	
	public ¾ÆºüÁö°©(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
		money = count * payCount;
	}
	public void play() {
		System.out.print("³î°í..");
	}
	public void watch() {
		System.out.println("TVºÁ¿ä.");
	}
}
