package JDBC;

import javax.swing.JOptionPane;

public class MemberMain2 {

	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("�ٲ�  ID�� �Է�");
		String pw = JOptionPane.showInputDialog("�ٲ�  PW�� �Է�");
		String name = JOptionPane.showInputDialog("�ٲ�  NAME�� �Է�");
		String tel = JOptionPane.showInputDialog("�ٲ�  TEL�� �Է�");
		String addr = JOptionPane.showInputDialog("�ٲ� ADDR�� �Է�");
		String style = JOptionPane.showInputDialog("�ٲ�  STYLE�� �Է�");
		String num = JOptionPane.showInputDialog("��ȣ ����");
		
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
