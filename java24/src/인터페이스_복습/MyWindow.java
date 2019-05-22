package 인터페이스_복습;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow extends JFrame implements ActionListener{
	JButton b1,b2;
	
	public MyWindow() {
		setSize(300,300);
		b1 = new JButton("1번 버튼");
		b2 = new JButton("2번 버튼");
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
			System.out.println("1번 버튼을 눌렀군요.");
		}else if(e.getSource()==b2) {
			System.out.println("2번 버튼을 눌렀군요.");
		}
	}
}
