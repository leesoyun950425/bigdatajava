package �������̽�;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow3 extends JFrame implements ActionListener{
	JButton b,b2; //���������� ����.
	
	public MyWindow3() {
		setSize(300, 300);
		b = new JButton("���� ������.");
		b2 = new JButton("���� ������.");
		add(b);
		add(b2);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		b.addActionListener(this);
		b2.addActionListener(this);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow3 name = new MyWindow3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			System.out.println("���� ������.�� �����̱���.");
		}else if(e.getSource() == b2) {
			System.out.println("���� ������.�� �����̱���.");
		}
	}
}
