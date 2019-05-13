package java14;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTest extends JPanel{
	public PanelTest() {
		JPanel panel = new JPanel();
		add("South",panel);
		JLabel l1 = new JLabel("오롤ㄹ");
		panel.add(l1);
	}
public static void main(String[] args) {
		JFrame f = new JFrame("연습");
		PanelTest panel1 = new PanelTest();
		f.getContentPane().add(panel1);
		
		f.setBounds(200, 200, 400, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
