package java22;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	public class CarThread extends Thread { //���� Ŭ���� , ���������� ����� �� ����.
		int x,y;
		ImageIcon icon;
		JLabel label;
		public CarThread(String fileName, int x ,int y) {
//			super();  �θ��� �⺻������ ȣ��
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
			//for��..x�� random���� �÷��� ���!!!
			//random�� int�� �߻�.
			//�߻��� int�� x�࿡ ������.
			//setBounds�� �缳�� x�ప���� ��ġ ����.
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
		setTitle("���� ������ �ڵ��� ���α׷�");
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
