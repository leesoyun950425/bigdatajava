package JDBC;

import javax.swing.JOptionPane;

public class MemberMain2 {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("바꿀  ID를 입력");
		String pw = JOptionPane.showInputDialog("바꿀  PW를 입력");
		String name = JOptionPane.showInputDialog("바꿀  NAME를 입력");
		String tel = JOptionPane.showInputDialog("바꿀  TEL를 입력");
		String addr = JOptionPane.showInputDialog("바꿀 ADDR를 입력");
		String style = JOptionPane.showInputDialog("바꿀  STYLE를 입력");
		String num = JOptionPane.showInputDialog("번호 선택");
		
		MemberDAO db = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setTel(tel);
		dto.setAddr(addr);
		dto.setStyle(style);
		dto.setNum(num);
		try {
			db.update(dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
