package JDBC;

import javax.swing.JOptionPane;

public class MemberUpdate {

	public static void main(String[] args) {
		String content = JOptionPane.showInputDialog("�ٲ�CONTENT�Է�");
		String mid = JOptionPane.showInputDialog("�ٲ�MID�Է�");
		String date = JOptionPane.showInputDialog("�ٲ�DATE�Է�");
		String count = JOptionPane.showInputDialog("�ٲ�COUNT�Է�");
		String id = JOptionPane.showInputDialog("������ID�Է�");
		
		MemberDAO2 db = new MemberDAO2();
		MemberDTO2 dto2 = new MemberDTO2();
		dto2.setContent(content);
		dto2.setMid(mid);
		dto2.setDate(date);
		dto2.setCount(count);
		dto2.setId(id);
		try {
			db.update(dto2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
