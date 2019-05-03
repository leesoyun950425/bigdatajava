package JDBC;

import javax.swing.JOptionPane;

public class MemberInsert {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("ID입력");
		String content = JOptionPane.showInputDialog("CONTENT입력");
		String mid = JOptionPane.showInputDialog("MID입력");
		String date = JOptionPane.showInputDialog("DATE입력");
		String count = JOptionPane.showInputDialog("COUNT입력");
		
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
