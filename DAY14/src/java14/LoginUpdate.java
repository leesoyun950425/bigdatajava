package java14;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class LoginUpdate extends JFrame{
	private JTextField pwText;
	private JTextField nameText;
	private JTextField telText;
	private JTextField addrText;
	
	public LoginUpdate() {
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("변경할 비밀번호");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setBounds(40, 40, 174, 21);
		getContentPane().add(lblNewLabel);
		
		pwText = new JTextField();
		pwText.setBackground(new Color(255, 255, 255));
		pwText.setForeground(new Color(0, 0, 0));
		pwText.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		pwText.setBounds(231, 37, 166, 27);
		getContentPane().add(pwText);
		pwText.setColumns(10);
		
		JLabel label = new JLabel("변경할 이름");
		label.setBackground(new Color(255, 255, 255));
		label.setForeground(new Color(0, 0, 0));
		label.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		label.setBounds(40, 86, 143, 21);
		getContentPane().add(label);
		
		nameText = new JTextField();
		nameText.setBackground(new Color(255, 255, 255));
		nameText.setForeground(new Color(0, 0, 0));
		nameText.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		nameText.setColumns(10);
		nameText.setBounds(231, 83, 166, 27);
		getContentPane().add(nameText);
		
		JLabel label_1 = new JLabel("변경할 전화번호");
		label_1.setBackground(new Color(255, 255, 255));
		label_1.setForeground(new Color(0, 0, 0));
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		label_1.setBounds(40, 138, 174, 21);
		getContentPane().add(label_1);
		
		telText = new JTextField();
		telText.setBackground(new Color(255, 255, 255));
		telText.setForeground(new Color(0, 0, 0));
		telText.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		telText.setColumns(10);
		telText.setBounds(231, 135, 166, 27);
		getContentPane().add(telText);
		
		JLabel label_2 = new JLabel("변경할 주소");
		label_2.setBackground(new Color(255, 255, 255));
		label_2.setForeground(new Color(0, 0, 0));
		label_2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		label_2.setBounds(40, 197, 143, 21);
		getContentPane().add(label_2);
		
		addrText = new JTextField();
		addrText.setBackground(new Color(255, 255, 255));
		addrText.setForeground(new Color(0, 0, 0));
		addrText.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		addrText.setColumns(10);
		addrText.setBounds(231, 194, 230, 27);
		getContentPane().add(addrText);
		
		JButton btnNewButton = new JButton("수정완료");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		btnNewButton.setForeground(new Color(25, 25, 112));
		btnNewButton.setBackground(new Color(160, 82, 45));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MembershipDAO dao = new MembershipDAO();
				MembershipDTO dto = new MembershipDTO();
				String pw = pwText.getText();
				String name = nameText.getText();
				String tel = telText.getText();
				String addr = addrText.getText();
				dto.setPw(pw);
				dto.setName(name);
				dto.setTel(tel);
				dto.setAddr(addr);
				dao.update(dto);
				dispose();
			}
		});
		btnNewButton.setBounds(173, 294, 129, 44);
		getContentPane().add(btnNewButton);
		setSize(500,432);
		
		setTitle("회원정보 수정하기");
		setVisible(true);
		
	}
}
