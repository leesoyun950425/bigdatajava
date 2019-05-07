package java15;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BbsMain {
	private JTextField idText;
	private JTextField titleText;
	private JTextField contentText;
	private JTextField etcText;
	public BbsMain() {
		JFrame f = new JFrame("³ªÀÇ °Ô½ÃÆÇ ¸¸µé±â");
		f.getContentPane().setBackground(new Color(100, 149, 237));
		f.setSize(400,579);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel lblNewLabel = new JLabel("<<\uC544\uC774\uB514>>");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 28));
		f.getContentPane().add(lblNewLabel);
		
		idText = new JTextField();
		idText.setBackground(Color.YELLOW);
		idText.setForeground(Color.BLUE);
		idText.setFont(new Font("±¼¸²", Font.BOLD, 28));
		f.getContentPane().add(idText);
		idText.setColumns(10);
		
		JLabel label = new JLabel("<<\uC81C\uBAA9>>");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("±¼¸²", Font.BOLD, 28));
		f.getContentPane().add(label);
		
		titleText = new JTextField();
		titleText.setForeground(new Color(139, 0, 0));
		titleText.setFont(new Font("±¼¸²", Font.BOLD, 28));
		titleText.setColumns(10);
		titleText.setBackground(Color.YELLOW);
		f.getContentPane().add(titleText);
		
		JLabel label_1 = new JLabel("<<\uB0B4\uC6A9>>");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("±¼¸²", Font.BOLD, 28));
		f.getContentPane().add(label_1);
		
		contentText = new JTextField();
		contentText.setForeground(new Color(139, 0, 0));
		contentText.setFont(new Font("±¼¸²", Font.BOLD, 28));
		contentText.setColumns(10);
		contentText.setBackground(Color.YELLOW);
		f.getContentPane().add(contentText);
		
		JLabel label_2 = new JLabel("<<\uAE30\uD0C0>>");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("±¼¸²", Font.BOLD, 28));
		f.getContentPane().add(label_2);
		
		etcText = new JTextField();
		etcText.setForeground(new Color(139, 0, 0));
		etcText.setFont(new Font("±¼¸²", Font.BOLD, 28));
		etcText.setColumns(10);
		etcText.setBackground(Color.YELLOW);
		f.getContentPane().add(etcText);
		
		JButton btnNewButton = new JButton("BBS \uAC80\uC0C9\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String inputId = idText.getText();
				BbsDAO dao = new BbsDAO();
				BbsDTO dto = dao.select(inputId);
				String id = dto.getId();
				String title = dto.getTitle();
				String content = dto.getContent();
				String etc = dto.getEtc();
				idText.setText(id);
				titleText.setText(title);
				contentText.setText(content);
				etcText.setText(etc);
			}
		});
		
		JButton btnBbs = new JButton("BBS \uC785\uB825\uD558\uAE30");
		btnBbs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BbsDAO dao = new BbsDAO();
				BbsDTO dto = new BbsDTO();
				String id = idText.getText();
				String title = titleText.getText();
				String content = contentText.getText();
				String etc = etcText.getText();
				dto.setId(id);
				dto.setTitle(title);
				dto.setContent(content);
				dto.setEtc(etc);
				try {
					dao.insert(dto);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnBbs.setForeground(Color.BLACK);
		btnBbs.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnBbs.setBackground(new Color(199, 21, 133));
		f.getContentPane().add(btnBbs);
		btnNewButton.setBackground(new Color(199, 21, 133));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 30));
		f.getContentPane().add(btnNewButton);
		
		JButton btnBbs_1 = new JButton("BBS \uC218\uC815\uD558\uAE30");
		btnBbs_1.setForeground(Color.BLACK);
		btnBbs_1.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnBbs_1.setBackground(new Color(199, 21, 133));
		f.getContentPane().add(btnBbs_1);
		
		JButton btnBbs_2 = new JButton("BBS \uC0AD\uC81C\uD558\uAE30");
		btnBbs_2.setForeground(Color.BLACK);
		btnBbs_2.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnBbs_2.setBackground(new Color(199, 21, 133));
		f.getContentPane().add(btnBbs_2);
		
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		BbsMain name = new BbsMain();
	}

}
