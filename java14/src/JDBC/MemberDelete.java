package JDBC;

import javax.swing.JOptionPane;

public class MemberDelete {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("삭제할ID입력");
		
		MemberDAO2 db = new MemberDAO2();
		MemberDTO2 dto2 = new MemberDTO2();
		dto2.setId(id);
		try {
			db.delete(dto2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
