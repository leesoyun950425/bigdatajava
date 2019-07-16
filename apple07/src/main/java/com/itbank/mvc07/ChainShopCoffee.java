package com.itbank.mvc07;

public class ChainShopCoffee extends ShopCoffee {

	
	@Override
	public void prepare() {
		System.out.println("체인 본점에서 물건을 받았다.");
	}
}
