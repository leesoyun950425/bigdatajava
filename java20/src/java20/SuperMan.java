package java20;

public class SuperMan extends Man {
	String power;
	boolean fly;
	
	public SuperMan() {
		
	}

	public SuperMan(String power, boolean fly) {
//		super();
		this.power = power;
		this.fly = fly;
	}
	public SuperMan(int height,String army,String power,boolean fly) {
		super(height,army);
		this.power = power;
		this.fly = fly;
	}

}
