package com.itbank.mvc06;

public class MyHome {
	static Door woodDoor;
	
	public static void main(String[] args) {
		woodDoor = new 나무문();
		woodDoor.open();
		woodDoor.close();
		woodDoor.key();
		woodDoor.made();
	}
}
