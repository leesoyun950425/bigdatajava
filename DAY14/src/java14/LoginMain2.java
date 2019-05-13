package java14;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LoginMain2 extends JPanel{
private MainTest win;
public LoginMain login ;

public LoginMain2(MainTest win) {
	setBackground(new Color(0, 0, 0));
	this.win = win;
	
	setLayout(null);
	LoginMain login = new LoginMain();
	
	String inputId = login.idText.getText();
	JLabel l1 = new JLabel(inputId);
	l1.setForeground(new Color(255, 255, 255));
	l1.setFont(new Font("±¼¸²", Font.BOLD, 20));
	l1.setBounds(84, 63, 198, 24);
	add(l1);
//	l1.setText();
	
	JLabel lblNewLabel = new JLabel("\uB2D8 \uC758 \uD398\uC774\uC9C0\uC785\uB2C8\uB2E4.");
	lblNewLabel.setForeground(new Color(255, 255, 255));
	lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 20));
	lblNewLabel.setBounds(84, 91, 281, 33);
	add(lblNewLabel);
	
	JButton btnNewButton = new JButton("\uC218\uC815");
	btnNewButton.setBackground(new Color(255, 255, 255));
	btnNewButton.setFont(new Font("굴림", Font.BOLD, 22));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			LoginUpdate u = new LoginUpdate();
		}
	});
	btnNewButton.setBounds(68, 144, 97, 34);
	add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("\uB85C\uADF8\uC544\uC6C3");
	btnNewButton_1.setBackground(new Color(255, 255, 255));
	btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 22));
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			win.change("LoginMain");
		}
	});
	btnNewButton_1.setBounds(188, 144, 129, 34);
	add(btnNewButton_1);
}
}