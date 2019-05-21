package java22;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadTest extends JFrame{
	private JLabel lb,lb2;
		public ThreadTest() {
			setTitle("나의 스레드");
			setSize(800, 500);
			setLayout(new BorderLayout());
			
			lb = new JLabel();
			lb2 = new JLabel();
			
			lb.setFont(new Font("Serif", Font.BOLD, 70));
			
			add(lb,BorderLayout.WEST);
			add(lb2,BorderLayout.EAST);
			
			TimerThread tm = new TimerThread();
			ImageThread it = new ImageThread();
			
			tm.start();
			it.start();
			
			setVisible(true);
		}
	
	class TimerThread extends Thread{
		
		
		public void run() {
			for (int i = 10; i > 0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				lb.setText(i+"");
			}
		}
	}

	class ImageThread extends Thread{
		
		public void run() {
			String [] img = {"m1.jpg","m2.jpg","m3.jpg","m4.jpg","m5.jpg","m6.jpg","m7.jpg","m8.jpg"};
			for (int i = 0; i < img.length; i++) {
				try {
					Thread.sleep(1000);
					ImageIcon icon = new ImageIcon(img[i]);
					lb2.setIcon(icon);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		ThreadTest f = new ThreadTest();
	}
}
