package window;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test2 {
	private static JTextField l1;
	private static JTextField l2;
	private static JTextField l3;
	public static void main(String[] args) {
		JFrame f = new JFrame("계산기");
		f.getContentPane().setBackground(new Color(119, 136, 153));
		f.getContentPane().setForeground(new Color(119, 136, 153));
		f.setSize(400, 500);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("숫자1>>");
		lblNewLabel.setForeground(new Color(178, 34, 34));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(lblNewLabel);
		
		l1 = new JTextField();
		l1.setBackground(new Color(135, 206, 235));
		l1.setForeground(new Color(0, 0, 255));
		l1.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(l1);
		l1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2>>");
		lblNewLabel_1.setForeground(new Color(178, 34, 34));
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(lblNewLabel_1);
		
		l2 = new JTextField();
		l2.setBackground(new Color(135, 206, 235));
		l2.setForeground(new Color(0, 0, 255));
		l2.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(l2);
		l2.setColumns(10);
		
		JLabel label = new JLabel("연산자>>");
		label.setForeground(new Color(178, 34, 34));
		label.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(label);
		
		l3 = new JTextField();
		l3.setBackground(new Color(135, 206, 235));
		l3.setForeground(new Color(0, 0, 255));
		l3.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(l3);
		l3.setColumns(10);
		
		JButton btnNewButton = new JButton("계산하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num1 = l1.getText();
				String num2 = l2.getText();
				String oper = l3.getText();
				
//				String sum = l3.getText();
//				String maina = l3.getText();
//				String gob = l3.getText();
//				String nanu = l3.getText();
				
				int su1 = Integer.parseInt(num1);
				int su2 = Integer.parseInt(num2);
				
//				if(sum.equals("+")) {
//					System.out.println(su1 + su2);
//				}else if(maina.equals("-")) {
//					System.out.println(su1 - su2);
//				}else if(gob.equals("*")) {
//					System.out.println(su1 * su2 );
//				}else if(nanu.equals("/")) {
//					System.out.println(su1 / su2);
//				}else {
//					System.out.println("잘못 입력하셨습니다.");
//				}
				
				int imsi = 0;
				
				switch(oper) {
				case "+":
					imsi = su1 + su2;
					break;
				case "-":
					imsi = su1 - su2;
					break;
				case "*":
					imsi = su1 * su2;
					break;
				case "/" :
					imsi = su1 / su2;
					break;
				default: 
					System.out.println("연산할 수 없는 기호입니다.");
				}
				
				System.out.println("두 수의 연산 결과는 "+imsi + "입니다.");
				
			}
		});
		btnNewButton.setForeground(new Color(123, 104, 238));
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 27));
		f.getContentPane().add(btnNewButton);
		
		f.setVisible(true);
	}
}
