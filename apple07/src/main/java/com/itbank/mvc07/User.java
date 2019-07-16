package com.itbank.mvc07;

public class User {
	public static void main(String[] args) {
		Cook korea = new KoreaCook();
		Cook japan = new JapanCook();
		
		korea.cooking();
		korea.pay();
		korea.order();
		
		japan.cooking();
		japan.pay();
		japan.order();
	}
}
