package 일기장;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class 다이어리 {
	public 다이어리() {
		JFrame f = new JFrame("나의 일기장 작성 화면");
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(600, 600);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JLabel l = new JLabel("<<<일기작성날짜>>>");
		l.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(l);
		JTextField t1 = new JTextField(25);
		t1.setBackground(Color.YELLOW);
		t1.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(t1);
		JLabel l2 = new JLabel("<<<일기작성제목>>>");
		l2.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(l2);
		JTextField t2 = new JTextField(25);
		t2.setBackground(Color.YELLOW);
		t2.setFont(new Font("굴림", Font.PLAIN, 18));
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel = new JLabel("<<<일기작성내용>>>");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		f.getContentPane().add(lblNewLabel);
		
		JTextArea text = new JTextArea();
		text.setBackground(Color.YELLOW);
		text.setRows(15);
		text.setColumns(50);
		f.getContentPane().add(text);
		
		JButton btnNewButton = new JButton("파일에 저장하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String day = t1.getText();
				try {
					FileWriter w = new FileWriter(day + ".txt");
					w.write("제목 : " + t2.getText() + "\n");
					w.write(text.getText()+"\n");
					
					w.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("파일에서 읽어오기");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		다이어리 diary = new 다이어리();
	}
}
