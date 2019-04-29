package 부품만들기;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 주문Test {
	private static JTextField t1;
	private static JTextField t2;
	static int start = 0;
	

	public static void main(String[] args) {
		String[] pic = {"a4.jpg","a1.jpg","a2.jpg","a3.jpg"};
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 105, 180));
		f.setTitle("주문하세요..");
		f.setSize(518,750);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		JButton img = new JButton();
		
		주문하기 su = new 주문하기();
		su.count = 0;
		int jjambbong = su.price();
		int udong = su.price();
		int jjajang = su.price();
		
		JButton button = new JButton("짬뽕");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImageIcon icon = new ImageIcon(pic[start+1]);
				img.setIcon(icon);
				su.count ++;
				t1.setText(String.valueOf(su.count));
				t2.setText(String.valueOf(jjambbong*su.count));
			}
		});
		button.setBackground(new Color(255, 255, 0));
		button.setFont(new Font("굴림", Font.BOLD, 13));
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("우동");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(pic[start+2]);
				img.setIcon(icon);
				su.count ++;
				t1.setText(String.valueOf(su.count));
				t2.setText(String.valueOf(udong*su.count));
			}
		});
		button_1.setBackground(new Color(255, 255, 0));
		button_1.setFont(new Font("굴림", Font.BOLD, 13));
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("자장");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(pic[start+3]);
				img.setIcon(icon);
				su.count ++;
				t1.setText(String.valueOf(su.count));
				t2.setText(String.valueOf(jjajang*su.count));
			}
		});
		button_2.setBackground(new Color(255, 255, 0));
		button_2.setFont(new Font("굴림", Font.BOLD, 13));
		f.getContentPane().add(button_2);
		
		JLabel lblNewLabel = new JLabel("개수");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 12));
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("금액");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		f.getContentPane().add(img);
		ImageIcon icon = new ImageIcon(pic[start]);
		img.setIcon(icon);
		
		f.setVisible(true);
	}
}
