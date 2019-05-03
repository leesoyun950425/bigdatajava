package JDBC;

import javax.swing.JOptionPane;

public class MemberInsert {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("ID�Է�");
		String content = JOptionPane.showInputDialog("CONTENT�Է�");
		String mid = JOptionPane.showInputDialog("MID�Է�");
		String date = JOptionPane.showInputDialog("DATE�Է�");
		String count = JOptionPane.showInputDialog("COUNT�Է�");
		
		MemberDAO2 db = new MemberDAO2();
		MemberDTO2 dto2 = new MemberDTO2();
		dto2.setId(id);
		dto2.setContent(content);
		dto2.setMid(mid);
		dto2.setDate(date);
		dto2.setCount(count);
		try {
			db.insert(dto2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
