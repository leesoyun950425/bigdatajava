package java14;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Event;

import javax.swing.JTextField;

public class LoginMain2 extends JPanel{
private MainTest win;
static String inputId;
static JLabel l1;
static JButton logoutbt;

public LoginMain2() {
	inputId = LoginMain.sessionId;
}

public LoginMain2(MainTest win) {
	setBackground(new Color(0, 0, 0));
	this.win = win;
	
	setLayout(null);
	
	l1 = new JLabel();
	l1.setForeground(new Color(255, 255, 255));
	l1.setFont(new Font("±¼¸²", Font.BOLD, 20));
	l1.setBounds(84, 63, 198, 24);
	add(l1);
	l1.setText(inputId);
	
	JLabel lblNewLabel = new JLabel("님의 페이지 입니다.");
	lblNewLabel.setForeground(new Color(255, 255, 255));
	lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 20));
	lblNewLabel.setBounds(84, 91, 323, 33);
	add(lblNewLabel);
	
	JButton btnNewButton = new JButton("수정하기");
	btnNewButton.setBackground(new Color(255, 255, 255));
	btnNewButton.setFont(new Font("굴림", Font.BOLD, 22));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			inputId = LoginMain.sessionId;
			LoginUpdate u = new LoginUpdate();
			u.idLb.setText(inputId);
		}
	});
	btnNewButton.setBounds(42, 139, 148, 34);
	add(btnNewButton);
	
	logoutbt = new JButton("로그아웃");
	logoutbt.setBackground(new Color(255, 255, 255));
	logoutbt.setFont(new Font("굴림", Font.BOLD, 22));
	logoutbt.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			win.change("LoginMain");
			LoginMain2.l1.setText("");
			LoginMain.idText.setText("");
			LoginMain.pwText.setText("");
		}
	});
	logoutbt.setBounds(142, 208, 129, 34);
	add(logoutbt);
	
	JButton button = new JButton("탈퇴하기");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			LoginDelete d = new LoginDelete();
			d.idLBel.setText(inputId);
		}
	});
	button.setFont(new Font("굴림", Font.BOLD, 22));
	button.setBackground(Color.WHITE);
	button.setBounds(226, 143, 148, 34);
	add(button);
	
	JButton btnNewButton_1 = new JButton("게시판");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			BorderMain bm = new BorderMain();
		}
	});
	btnNewButton_1.setBounds(153, 286, 97, 23);
	add(btnNewButton_1);
	
	JButton btnNewButton_2 = new JButton("마이페이지");
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			MemberMy my = new MemberMy();
		}
	});
	btnNewButton_2.setBounds(142, 330, 129, 23);
	add(btnNewButton_2);
	
	setVisible(true);
}
}