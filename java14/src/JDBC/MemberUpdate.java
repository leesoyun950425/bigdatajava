package JDBC;

import javax.swing.JOptionPane;

public class MemberUpdate {

	public static void main(String[] args) {
		String content = JOptionPane.showInputDialog("바꿀CONTENT입력");
		String mid = JOptionPane.showInputDialog("바꿀MID입력");
		String date = JOptionPane.showInputDialog("바꿀DATE입력");
		String count = JOptionPane.showInputDialog("바꿀COUNT입력");
		String id = JOptionPane.showInputDialog("선택할ID입력");
		
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
