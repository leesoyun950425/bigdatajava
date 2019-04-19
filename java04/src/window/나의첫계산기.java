package window;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의첫계산기 {
	private static JTextField n1;
	private static JTextField n2;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 계산기");
		f.getContentPane().setBackground(new Color(100, 149, 237));
		f.setSize(500, 400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("<<<나의 계산기>>>");
		lblNewLabel.setForeground(new Color(199, 21, 133));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("숫자1>>");
		label_1.setForeground(new Color(0, 0, 205));
		label_1.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(label_1);
		
		n1 = new JTextField();
		n1.setBackground(new Color(255, 255, 0));
		n1.setForeground(new Color(0, 0, 205));
		n1.setFont(new Font("Dialog", Font.PLAIN, 30));
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel label_2 = new JLabel("숫자2>>");
		label_2.setForeground(new Color(0, 0, 205));
		label_2.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(label_2);
		
		n2 = new JTextField();
		n2.setForeground(new Color(0, 0, 205));
		n2.setFont(new Font("Dialog", Font.PLAIN, 30));
		n2.setColumns(10);
		n2.setBackground(Color.YELLOW);
		f.getContentPane().add(n2);
		
		JButton b = new JButton("두 수를 계산");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = n1.getText();
				String num2 = n2.getText();
				
				int number1 = Integer.parseInt(num1);
				int number2 = Integer.parseInt(num2);
				
				System.out.println(number1 + number2 );
			}
		});
		b.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(b);
		
		
		
		f.setVisible(true);
	}

}
