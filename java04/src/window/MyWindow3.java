package window;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class MyWindow3 {
	public static void main(String[] args) {
		//프레임
		JFrame f = new JFrame("입력값 받는 프로그램.");
		f.setFont(new Font("Ebrima", Font.PLAIN, 12));
		f.setSize(401,371);
		
		
		//물흐르듯이 배치
		FlowLayout flow = new FlowLayout();
		FlowLayout flow1 = new FlowLayout();
		
		JLabel label = new JLabel("당신이 사용하는 개발 툴을 입력하세요.");
		JLabel label1 = new JLabel("당신의 주요 과목을 입력하세요.");
		label.setFont(new Font("굴림체", Font.PLAIN, 18));
		label.setForeground(Color.BLUE);
		
		JTextField text = new JTextField(20);
		JTextField text1 = new JTextField(20);
		text1.setFont(new Font("굴림", Font.PLAIN, 16));
		text.setFont(new Font("굴림", Font.PLAIN, 16));
		JButton button1 = new JButton("나를 눌러요.");
		
		
		f.getContentPane().setLayout(flow);
		//글자들
		//입력받는 화면
		
		f.getContentPane().add(label);
		f.getContentPane().add(text);
		
		f.getContentPane().add(label1);
		f.getContentPane().add(text1);
		
		JButton button = new JButton("나를 눌러요.");
		button.setBackground(new Color(46, 139, 87));
		button.setFont(new Font("굴림", Font.PLAIN, 15));
		
		//버튼
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("버튼이 눌러졌군요..!!");
				String data = text.getText();
				System.out.println("당신의 사용하는 개발 툴은 : "+data);
			}
		});
	
		f.getContentPane().add(button);
		
		JButton button2 = new JButton("나도 눌러요.");
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String data1 = text1.getText();
				System.out.println("당신의 주요 과목은 : " + data1);
			}
		});
		button2.setBackground(new Color(139, 0, 139));
		button2.setFont(new Font("굴림", Font.PLAIN, 15));
		f.getContentPane().add(button2);
		
		
		f.setVisible(true);
	}
}
