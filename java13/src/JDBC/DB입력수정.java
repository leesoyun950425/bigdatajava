package JDBC;

import javax.swing.JOptionPane;

public class DB�Է¼��� {

	public static void main(String[] args) {
		String telUp = JOptionPane.showInputDialog("������ ��ȭ��ȣ");
		String idUp = JOptionPane.showInputDialog("������ ID");
	
		DBó��Test db1 = new DBó��Test();
		try {
			db1.update(telUp, idUp);
		} catch (Exception e) {
			System.out.println("�����߻�!");
			e.printStackTrace();
		}
	}
}
