import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JToolBar;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class MembershipMain extends JPanel{
	private JTextField idText;
	private JTextField nameText;
	private JTextField telText;
	private JTextField addrText;
	private JTextField styleText;
	private JPasswordField pwText;
	private JPasswordField pwTextTest;
	public MembershipMain() {
		JPanel p = new JPanel();
		p.setBackground(new Color(255, 255, 224));
		p.setSize(400, 384);
		p.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.BOLD, 14));
		lblNewLabel_1.setBounds(12, 46, 100, 15);
		p.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("비밀번호");
		lblNewLabel_2.setFont(new Font("나눔고딕", Font.BOLD, 14));
		lblNewLabel_2.setBounds(12, 82, 100, 15);
		p.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("비밀번호 확인");
		lblNewLabel_3.setFont(new Font("나눔고딕", Font.BOLD, 14));
		lblNewLabel_3.setBounds(12, 117, 100, 15);
		p.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("이름");
		lblNewLabel_4.setFont(new Font("나눔고딕", Font.BOLD, 14));
		lblNewLabel_4.setBounds(12, 152, 100, 15);
		p.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("전화번호");
		lblNewLabel_5.setFont(new Font("나눔고딕", Font.BOLD, 14));
		lblNewLabel_5.setBounds(12, 190, 100, 15);
		p.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("주소");
		lblNewLabel_6.setFont(new Font("나눔고딕", Font.BOLD, 14));
		lblNewLabel_6.setBounds(12, 232, 100, 15);
		p.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("선호스타일");
		lblNewLabel_7.setFont(new Font("나눔고딕", Font.BOLD, 14));
		lblNewLabel_7.setBounds(12, 270, 100, 15);
		p.add(lblNewLabel_7);
		
		idText = new JTextField();
		idText.setFont(new Font("나눔고딕", Font.BOLD, 14));
		idText.setBounds(124, 40, 139, 21);
		p.add(idText);
		idText.setColumns(10);
//		if(pwText.equals(pwTextTest)) {
//			JLabel pwLable = new JLabel("같습니다.");
//			p.add(pwLable);
//		}else {
//			JLabel pwLable = new JLabel("다릅니다.");
//			p.add(pwLable);
//		}
//		
		nameText = new JTextField();
		nameText.setFont(new Font("나눔고딕", Font.BOLD, 14));
		nameText.setBounds(124, 146, 139, 21);
		p.add(nameText);
		nameText.setColumns(10);
		
		telText = new JTextField();
		telText.setFont(new Font("나눔고딕", Font.BOLD, 14));
		telText.setBounds(124, 184, 139, 21);
		p.add(telText);
		telText.setColumns(10);
		
		addrText = new JTextField();
		addrText.setFont(new Font("나눔고딕", Font.BOLD, 14));
		addrText.setBounds(124, 226, 253, 21);
		p.add(addrText);
		addrText.setColumns(10);
		
		styleText = new JTextField();
		styleText.setFont(new Font("나눔고딕", Font.BOLD, 14));
		styleText.setBounds(124, 270, 139, 21);
		p.add(styleText);
		styleText.setColumns(10);
		
		JButton b2 = new JButton("회원가입 완료");
		b2.setForeground(new Color(255, 105, 180));
		b2.setFont(new Font("나눔고딕", Font.BOLD, 14));
		b2.setBounds(142, 335, 119, 23);
		p.add(b2);
		
		JButton b1 = new JButton("중복확인");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputId = idText.getText();
				MembershipDAO dao = new MembershipDAO();
				MembershipDTO dto = dao.selectId(inputId);
				String id = dto.getId();
				if(inputId.equals(id)) {
					JOptionPane.showMessageDialog(null, "중복됐습니다.다시 입력하세요.");
					
				}else {
					JOptionPane.showMessageDialog(null, "성공");
				}
			}
		});
		b1.setForeground(new Color(255, 105, 180));
		b1.setFont(new Font("나눔고딕", Font.BOLD, 14));
		b1.setBounds(288, 43, 100, 23);
		p.add(b1);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setForeground(Color.BLACK);
		toolBar.setFont(new Font("맑은 고딕", Font.BOLD, 17));
		toolBar.setToolTipText("회원가입");
		toolBar.setBackground(new Color(100, 149, 237));
		toolBar.setBounds(0, 0, 400, 21);
		p.add(toolBar);
		
		pwText = new JPasswordField();
		pwText.setBounds(124, 79, 139, 21);
		p.add(pwText);
		
		pwTextTest = new JPasswordField();
		pwTextTest.setBounds(124, 114, 139, 21);
		p.add(pwTextTest);
		
		
		p.setVisible(true);
	}
}
