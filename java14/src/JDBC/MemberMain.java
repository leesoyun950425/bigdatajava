package JDBC;

import javax.swing.JOptionPane;

public class MemberMain {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("��ȣ�Է�");
		String id = JOptionPane.showInputDialog("ID�Է�");
		String pw = JOptionPane.showInputDialog("PW�Է�");
		String name = JOptionPane.showInputDialog("NAME�Է�");
		String tel = JOptionPane.showInputDialog("TEL�Է�");
		String addr = JOptionPane.showInputDialog("�ּ��Է�");
		String style = JOptionPane.showInputDialog("STYLE�Է�");
		
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
