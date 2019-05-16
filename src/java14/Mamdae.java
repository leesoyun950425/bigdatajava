package java14;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Mamdae {
	
	static JPanel loginmm;
	public static void main(String[] args) {
		
//		Dimension dim = new Dimension(1000,1000);
		
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
//		f.setLocation(100, 500);
//		f.setPreferredSize(dim);
		
		BorderLayout border = new BorderLayout();
		f.setLayout(border);
		loginmm = LoginMain.login;
//		JPanel p = new JPanel();
//		p.add(loginmm);
		f.getContentPane().add(loginmm,BorderLayout.WEST);
		
		
		f.setVisible(true);
	}
}
