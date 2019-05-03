package JDBC;

import javax.swing.JOptionPane;

public class MemberMain {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("번호입력");
		String id = JOptionPane.showInputDialog("ID입력");
		String pw = JOptionPane.showInputDialog("PW입력");
		String name = JOptionPane.showInputDialog("NAME입력");
		String tel = JOptionPane.showInputDialog("TEL입력");
		String addr = JOptionPane.showInputDialog("주소입력");
		String style = JOptionPane.showInputDialog("STYLE입력");
		
		MemberDAO db = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		dto.setNum(num);
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setTel(tel);
		dto.setAddr(addr);
		dto.setStyle(style);
		try {
			db.insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
