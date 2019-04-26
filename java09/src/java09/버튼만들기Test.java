package java09;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 버튼만들기Test {
	static int pic = 2;
	public static void main(String[] args) {
		String[] pic = {"s1.jpg","s2.jpg","s3.jpg","s4.jpg","s5.jpg"};
		int i = 0;
		
		JFrame f = new JFrame();
		f.setTitle("나의 그림");
		f.setSize(501, 690);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		JButton img = new JButton();
		f.getContentPane().add(img);
		ImageIcon icon = new ImageIcon("s1.jpg");
		img.setIcon(icon);
		
		JButton left = new JButton("왼쪽");
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i==0) {
					
				}
			}
		});
		left.setFont(new Font("굴림", Font.BOLD, 45));
		f.getContentPane().add(left);
		
		JButton right = new JButton("오른쪽");
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		right.setFont(new Font("굴림", Font.BOLD, 45));
		f.getContentPane().add(right);
		
		
		f.setVisible(true);
	}
}
