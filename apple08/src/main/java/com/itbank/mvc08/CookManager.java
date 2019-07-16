package com.itbank.mvc08;

public class CookManager {

	/* ICook icook2; 한영이가 알려준것>< */ 
	ICook icook;
	
	public CookManager() {
	}
	
	public CookManager(ICook icook) {
		icook.makeRice();
		icook.makeSalad();
		icook.makeSoup();
		icook.makeSource();
		/* icook2 = icook; 한영이가 알려준것>< */
		this.icook = icook;
	}
	public void orderRice() {
		icook.makeRice();
	}
	public void orderSoup() {
		icook.makeSoup();
	}
	
}
