package java22;

public class StarTest extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.print("¡Ú");
		}
	}
}
