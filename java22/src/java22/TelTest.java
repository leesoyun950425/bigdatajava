package java22;

public class TelTest extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.print("¢Ï");
		}
	}
}
