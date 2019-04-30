package 일기장;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class 로그인 {
	private JTextField t1;
	private JTextField t2;
	public 로그인() {

		JFrame f = new JFrame("나의 일기장 로그인 화면");
		f.setSize(600, 600);
		JLabel l = new JLabel();
		ImageIcon icon = new ImageIcon("m1.jpg");
		l.setIcon(icon);
		
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(l);
		
		JLabel lblNewLabel = new JLabel("ID입력 :");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("PW입력 : ");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 20));
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton = new JButton("로그인 처리");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(t1.getText().equals("root")&&t2.getText().equals("1234")) {
					다이어리 diary = new 다이어리();
				}
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(btnNewButton);
		
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		로그인 log = new 로그인();
	}
}
