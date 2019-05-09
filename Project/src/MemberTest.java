import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
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

public class MemberTest {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField t1;
	private static JTextField t2;
	private static JPasswordField passwordField;
	public static void main(String[] args) {
		JFrame f = new JFrame();
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
				String inputId = textField.getText();
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
		
		t1 = new JTextField();
		t1.setBounds(101, 53, 116, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(101, 110, 116, 21);
		f.getContentPane().add(t2);
		t2.setColumns(10);
		if(t1.equals(t2)) {
			
		}else {
			JLabel pwLable = new JLabel("다릅니다.");
			f.getContentPane().add(pwLable);
		}
		
		JLabel lblNewLabel_1 = new JLabel("비번");
		lblNewLabel_1.setBounds(22, 56, 57, 15);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("확인");
		lblNewLabel_2.setBounds(22, 113, 57, 15);
		f.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(152, 161, 116, 21);
		f.getContentPane().add(passwordField);
		
		JLabel l1 = new JLabel("일치");
		l1.setBounds(253, 113, 57, 15);
		f.getContentPane().add(l1);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 217, 330, 179);
		f.getContentPane().add(panel);
		
		MembershipMain m1 = new MembershipMain();
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnNewButton.setBounds(309, 184, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		
		f.setVisible(true);
	
	}
}
