package java14;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JTree;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JPanel;
import java.awt.Color;

public class MembershipTest extends JFrame{
	public MembershipTest() {
	}
	
	private static JTextField textField;
	private static JTextField textField_1;
	private static JPasswordField passwordField;
	private static JPasswordField pwText;
	private static JPasswordField pwTextTest1;
	private static JTextField pwTextTest2;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(147, 112, 219));
		f.setSize(434,463);
		f.getContentPane().setLayout(null);
		
			
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(22, 10, 57, 15);
		f.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 7, 116, 21);
		f.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("중복확인");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputId = textField_1.getText();
				MembershipDAO dao = new MembershipDAO();
				MembershipDTO dto = dao.selectId(inputId);
				String id = dto.getId();
				if(inputId.equals(id)) {
					JOptionPane.showMessageDialog(null, "중복됐습니다");
				}else {
					JOptionPane.showMessageDialog(null, "성공");
				}
			}
		});
		btnNewButton_1.setBounds(255, 6, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		
		JLabel lblNewLabel_1 = new JLabel("비번");
		lblNewLabel_1.setBounds(22, 56, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("확인");
		lblNewLabel_2.setBounds(22, 113, 57, 15);
		f.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(152, 161, 116, 21);
		f.getContentPane().add(passwordField);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 217, 330, 179);
		f.getContentPane().add(panel);
		JLayeredPane laypan = new JLayeredPane();
		f.getContentPane().add(laypan);
	
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MembershipMain m1 = new MembershipMain();
			}
		});
		btnNewButton.setBounds(309, 184, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		pwText = new JPasswordField();
		pwText.setBounds(101, 56, 116, 27);
		f.getContentPane().add(pwText);
		
		pwTextTest1 = new JPasswordField();
		pwTextTest1.setBounds(101, 113, 116, 27);
		f.getContentPane().add(pwTextTest1);
		
		pwTextTest2 = new JTextField();
		pwTextTest2.setBackground(new Color(147, 112, 219));
		pwTextTest2.setBounds(245, 113, 132, 27);
		f.getContentPane().add(pwTextTest2);
		pwTextTest2.setColumns(10);
		
		
		
		f.setVisible(true);
	
	}
}