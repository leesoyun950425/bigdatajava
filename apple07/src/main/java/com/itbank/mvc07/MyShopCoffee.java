package com.itbank.mvc07;

public class MyShopCoffee extends ShopCoffee {

	@Override
	public void prepare() {
		System.out.println("내가 사장이라 내가 준비를 했다.");
	}

}
