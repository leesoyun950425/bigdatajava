package com.itbank.mvc07;

public class FactoryBean {
	public Object getBean(String name) {
		Object bean = null;
		if(name.equals("apple")) {
			bean = new AppleTv();
		}else if(name.equals("banana")){
			bean = new BananaTv();
		}else if(name.equals("cherry")) {
			bean = new CherryTv();
		}else {
			 
		}
		return bean;
	}
}
