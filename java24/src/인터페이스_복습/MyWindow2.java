package 인터페이스_복습;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow2 extends JFrame {
	JButton b1,b2;
	
	public MyWindow2() {
		setSize(300,300);
		b1 = new JButton("1번 버튼");
		b2 = new JButton("2번 버튼");
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(b1);
		add(b2);
		ActionProcess action = new ActionProcess();
		ActionProcess2 action2 = new ActionProcess2();
		b1.addActionListener(action);
		b2.addActionListener(action2);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWindow2 name = new MyWindow2();
	}
}
