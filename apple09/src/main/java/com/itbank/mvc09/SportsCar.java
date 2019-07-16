package com.itbank.mvc09;

import com.sun.java.swing.plaf.windows.resources.windows;

public class SportsCar implements Car {

	Window window;
	Door door;
	String color;
	int speed;
	
	public SportsCar() {
	}
	
	public SportsCar(Window window, String color, int speed,Door door) {
		this.window = window;
		this.color = color;
		this.speed = speed;
		this.door = door;
	}

	public SportsCar(Window window,Door door) {
		this.window = window;
		this.door = door;
	}
	public void setWindow(Window window,Door door) {
		this.window = window;
		this.door = door;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	@Override
	public void open() {
		window.open();
		door.doorOpen();
		System.out.println("차 색은 : " + color);
		System.out.println("차 최고 속도를 : " + speed);
	}

	@Override
	public void close() {
		window.close();
		door.doorClose();
	}
}
