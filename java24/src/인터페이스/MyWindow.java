package �������̽�;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow extends JFrame{

	public MyWindow() {
		setSize(300, 300);
		JButton b = new JButton("���� ������.");
		add(b);
		ActionProcess action = new ActionProcess();
		b.addActionListener(action);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow name = new MyWindow();
	}

}
