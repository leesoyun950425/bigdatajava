package ½ºÅÂÆ½;

public class Person {
	int height;
	int weight;
	String secret;
	String address;
	
	public Person() {
	}

	public Person(int height, int weight, String secret, String address) {
		this.height = height;
		this.weight = weight;
		this.secret = secret;
		this.address = address;
	}
	
	public Person(int height,int weight,String secret) {
		this.height = height;
		this.weight = weight;
		this.secret = secret;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getSecret() {
		return secret;
	}
	
	public double goodWeight() {
		return (height-100)*0.9; 
	}
}
