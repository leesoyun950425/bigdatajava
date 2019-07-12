package com.itbank.mvc06;

public class SingleObject {

	public static int count;
	public static SingleObject object;
	
	public SingleObject() {
		System.out.println("SingleObject객체 생성됨.");
		count++;
	}
	public static SingleObject getInstance() {
		if(object == null) {
			object = new SingleObject();
		}
		return object;
	}
	public String getString() {
		return "Single OK";
	}
}
