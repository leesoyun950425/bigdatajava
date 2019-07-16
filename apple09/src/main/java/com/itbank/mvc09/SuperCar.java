package com.itbank.mvc09;

public class SuperCar implements Car{

	Window window;
	Door door;
	
	public SuperCar() {
	}
	
	public SuperCar(Window window,Door door) {
		this.window = window;
		this.door = door;
	}
	
	public void setWindow(Window window) {
		this.window = window;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	@Override
	public void open() {
		window.open();
		door.doorOpen();
	}

	@Override
	public void close() {
		window.close();
		door.doorClose();
	}
}
