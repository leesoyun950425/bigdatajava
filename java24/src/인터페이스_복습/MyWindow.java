package �������̽�_����;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow extends JFrame implements ActionListener{
	JButton b1,b2;
	
	public MyWindow() {
		setSize(300,300);
		b1 = new JButton("1�� ��ư");
		b2 = new JButton("2�� ��ư");
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		MyWindow name = new MyWindow();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			System.out.println("1�� ��ư�� ��������.");
		}else if(e.getSource()==b2) {
			System.out.println("2�� ��ư�� ��������.");
		}
	}
}
