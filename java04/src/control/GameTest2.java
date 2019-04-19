package control;

import java.util.Random;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;


public class GameTest2 {
	public static void main(String[] args) {
		JFrame f = new JFrame("가위 바위 보");
		f.setSize(500,400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Random random = new Random();
		int com = random.nextInt(3);
		
		
		
		JButton b1 = new JButton("가위");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		b1.setFont(new Font("Dialog", Font.BOLD, 40));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("바위");
		b2.setFont(new Font("Dialog", Font.BOLD, 40));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("보");
		b3.setFont(new Font("Dialog", Font.BOLD, 40));
		f.getContentPane().add(b3);
		
		JLabel l1 = new JLabel("New label");
		l1.setFont(new Font("굴림", Font.PLAIN, 47));
		f.getContentPane().add(l1);
		
		
//		Random random = new Random();
//		int com = random.nextInt(3);
//	
		
		
		
		
//		int result = my - com;
//		
//		switch(my) {
//		case 0:
//			if(result == -2 ) {
//				System.out.println("이겼습니다.");
//			}else if(result == -1){
//				System.out.println("졌습니다.");
//			}else {
//				System.out.println("비겼습니다.");
//			}
//			break;
//		case 1:
//			if(result == -1 ) {
//				System.out.println("이겼습니다.");
//			}else if(result == 2){
//				System.out.println("졌습니다.");
//			}else {
//				System.out.println("비겼습니다.");
//			}
//			break;
//		case 2:
//			if(result == 1 ) {
//				System.out.println("이겼습니다.");
//			}else if(result == -2){
//				System.out.println("졌습니다.");
//			}else {
//				System.out.println("비겼습니다.");
//			}
//			break;
		
		
	f.setVisible(true);

	}
}
