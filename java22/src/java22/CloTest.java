package java22;

import java.util.Random;

public class CloTest extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.print("¢¿");
		}
	}
}
