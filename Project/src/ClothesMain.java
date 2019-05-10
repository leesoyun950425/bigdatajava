

	import javax.swing.JFrame;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import java.awt.BorderLayout;
	import java.awt.FlowLayout;
	import java.awt.event.ActionListener;
	import java.util.Date;
	import java.awt.event.ActionEvent;
	import java.awt.Color;
	import javax.swing.JPanel;
	import javax.swing.JLabel;
	import java.awt.Font;
	import javax.swing.JTextField;

	public class ClothesMain {
	   public ClothesMain() {
	   }
	   private static JTextField textField;
	   private static JTextField textField_1;
	   
	   static int witch = 1;

	   public static void main(String[] args) {
	      
	      JFrame f = new JFrame("쇼핑몰");
	      FlowLayout flow = new FlowLayout();
	      MembershipMain m1 = new MembershipMain();
	      
	      
	      
	      ImageIcon icon = new ImageIcon("1.png");
	      ImageIcon micon = new ImageIcon("1.jpg");
	      
	      String[] pic = {"1.jpg", "2.jpg", "3.jpg"};
	      
	      
	      f.getContentPane().setLayout(null);
	      
	      JButton b1 = new JButton("");
	      b1.setBackground(Color.YELLOW);
	      b1.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	         }
	      });
	      b1.setBounds(0, 0, 1295, 63);
	      f.getContentPane().add(b1);
	      b1.setIcon(icon);
	      
	      JPanel p1 = new JPanel();
	      p1.setBackground(Color.BLACK);
	      
	      p1.setBounds(0, 66, 263, 645);
	      f.getContentPane().add(p1);
	      p1.setLayout(null);
	      
	      JLabel lb1 = new JLabel("\uC544\uC774\uB514");
	      lb1.setFont(new Font("굴림", Font.BOLD, 18));
	      lb1.setForeground(Color.WHITE);
	      lb1.setBounds(12, 79, 57, 15);
	      p1.add(lb1);
	      
	      JLabel lb2 = new JLabel("\uBE44\uBC00\uBC88\uD638");
	      lb2.setFont(new Font("굴림", Font.BOLD, 18));
	      lb2.setForeground(Color.WHITE);
	      lb2.setBounds(12, 130, 76, 21);
	      p1.add(lb2);
	      
	      textField = new JTextField();
	      textField.setBounds(112, 78, 139, 21);
	      p1.add(textField);
	      textField.setColumns(10);
	      
	      textField_1 = new JTextField();
	      textField_1.setBounds(112, 132, 139, 21);
	      p1.add(textField_1);
	      textField_1.setColumns(10);
	      
	      JButton b2 = new JButton("\uB85C\uADF8\uC778");
	      b2.setFont(new Font("굴림", Font.BOLD, 16));
	      b2.setBounds(12, 189, 97, 23);
	      p1.add(b2);
	      
	      JButton b3 = new JButton("\uD68C\uC6D0\uAC00\uC785");
	      b3.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            MembershipMain m1 = new MembershipMain();
	         }
	      });
	      b3.setFont(new Font("굴림", Font.BOLD, 16));
	      b3.setBounds(133, 189, 118, 23);
	      p1.add(b3);
	      
	      
	      JPanel p2 = new JPanel();
	      p2.setLayout(null);
	      
	      p2.setBounds(273, 66, 708, 645);
	      f.getContentPane().add(p2);
	      
	      JButton mb1 = new JButton("\uC0C1\uC758");
	      mb1.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            
	         }
	      });
	      mb1.setBackground(Color.CYAN);
	      mb1.setFont(new Font("굴림", Font.BOLD, 30));
	      mb1.setBounds(0, 0, 165, 48);
	      p2.add(mb1);
	      
	      JButton mb2 = new JButton("\uD558\uC758");
	      mb2.setBackground(Color.CYAN);
	      mb2.setFont(new Font("굴림", Font.BOLD, 30));
	      mb2.setBounds(177, 0, 165, 48);
	      p2.add(mb2);
	      
	      JButton mb3 = new JButton("\uC544\uC6B0\uD130");
	      mb3.setBackground(Color.CYAN);
	      mb3.setFont(new Font("굴림", Font.BOLD, 30));
	      mb3.setBounds(354, 0, 165, 48);
	      p2.add(mb3);
	      
	      JButton mb4 = new JButton("\uC2E0\uBC1C");
	      mb4.setBackground(Color.CYAN);
	      mb4.setFont(new Font("굴림", Font.BOLD, 30));
	      mb4.setBounds(531, 0, 165, 48);
	      p2.add(mb4);
	      
	      JButton mb5 = new JButton(""); //메인화면사진
	      mb5.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	               int count = 1;
	               ImageIcon icon1 = new ImageIcon(pic[witch]);
	               mb5.setIcon(icon1);
	               witch = witch + count;
	               count++;
	         }
	      });
	      mb5.setBounds(0, 58, 696, 244);
	      p2.add(mb5);
	      mb5.setIcon(micon);
	      
	      
	      f.setSize(1300, 750);
	      
	      f.setVisible(true);
	   }

}
