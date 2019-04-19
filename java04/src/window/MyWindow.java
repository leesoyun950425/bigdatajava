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

public class MyWindow {
	public static void main(String[] args) {
		//프레임
		JFrame f = new JFrame("입력값 받는 프로그램.");
		f.setFont(new Font("Ebrima", Font.PLAIN, 12));
		f.setSize(401,371);
		
		//물흐르듯이 배치
		FlowLayout flow = new FlowLayout();
		JTextField text = new JTextField(20);
		text.setFont(new Font("굴림", Font.PLAIN, 16));
		JButton button = new JButton("나를 눌러요.");
		button.setBackground(new Color(46, 139, 87));
		button.setForeground(new Color(165, 42, 42));
		button.setFont(new Font("굴림", Font.PLAIN, 15));
		JLabel label = new JLabel("당신의 주요 프로그램 언어를 입력하세요.");
		label.setFont(new Font("굴림체", Font.PLAIN, 18));
		label.setForeground(Color.BLUE);
		
		f.getContentPane().setLayout(flow);
		
		//버튼
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("버튼이 눌러졌군요..!!");
				String data = text.getText();
				System.out.println("당신의 주요 과목은 : "+data);
			}
		});
		//글자들
		//입력받는 화면
		
		f.getContentPane().add(label);
		f.getContentPane().add(text);
		f.getContentPane().add(button);
		
		f.setVisible(true);
	}
}
