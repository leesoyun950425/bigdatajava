package JDBC;

import javax.swing.JOptionPane;

public class MemberMain3 {
	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("지울 ID입력");
		
		MemberDAO db = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		try {
			db.delete(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
