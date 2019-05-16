package java14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class PanelTest2 {
	private JFrame f = new JFrame();
	private JLayeredPane lpane = new JLayeredPane();
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	public PanelTest2() {
		f.setPreferredSize(new Dimension(600,500));
		f.setLayout(new BorderLayout());
		f.add(lpane,BorderLayout.CENTER);
		lpane.setBounds(0, 0, 600, 400);
		panel1.setBackground(Color.BLUE);
		panel1.setBounds(0, 0, 600, 400);
		panel1.setOpaque(true);
		panel2.setBackground(Color.GREEN);
		panel2.setBounds(200, 100, 100, 100);
		panel2.setOpaque(true);
		lpane.add(panel1,new Integer(0),0);
		lpane.add(panel2,new Integer(1),0);
		f.pack();
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new PanelTest2();
	}
	
}
