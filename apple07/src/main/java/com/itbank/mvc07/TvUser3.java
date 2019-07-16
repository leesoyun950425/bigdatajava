package com.itbank.mvc07;

public class TvUser3 {
	public static void main(String[] args) {
		FactoryBean factory = new FactoryBean();
		Tv tv = (Tv)factory.getBean(args[0]); //Run as -> Run Configurations -> Arguments -> Run
		tv.powerOn();
		tv.powerOff();
		tv.volumeDown();
		tv.volumUp();
	}
}
