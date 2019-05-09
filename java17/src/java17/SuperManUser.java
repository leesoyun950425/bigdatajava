package java17;

public class SuperManUser {
	public static void main(String[] args) {
		SuperMan sMan = new SuperMan();
		sMan.height = 200; //Person
		sMan.weight = 100; //Person
		sMan.eye = 3; //Man
		sMan.fly = true; //SuperMan
		System.out.println(sMan);
		sMan.eat(); //Person
		sMan.sleep(); //Person
		sMan.army(); //Man
		sMan.flySpeed(); //SuperMan
		
	}
}
