package java22;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	public class CarThread extends Thread { //내부 클래스 , 독립적으로 사용할 수 없다.
		int x,y;
		ImageIcon icon;
		JLabel label;
		public CarThread(String fileName, int x ,int y) {
//			super();  부모의 기본생성자 호출
			this.x = x;
			this.y = y;
			icon = new ImageIcon(fileName);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 100,100);
			add(label);
		}
		@Override
		public void run() {
			//for문..x축 random으로 늘려서 경기!!!
			//random한 int값 발생.
			//발생한 int값 x축에 더해줌.
			//setBounds로 재설된 x축값으로 위치 지정.
			Random ran = new Random();
			
			for (int i = 0; i < 200; i++) {
				int random =ran.nextInt(10);
				label.setBounds(x,y,100,100);
				x = x + random;
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public CarGame() {
		setTitle("나의 스레드 자동차 프로그램");
		setSize(600, 300);
		
		CarThread car1 = new CarThread("car1.gif",100,0);
		CarThread car2 = new CarThread("car2.gif",100,50);
		CarThread car3 = new CarThread("car3.gif",100,100);
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);
	}
	public static void main(String[] args) {
		CarGame car = new CarGame();
	}
}
