package JDBC;

import javax.swing.JOptionPane;

public class DB�Է�2 {

	public static void main(String[] args) {
		String id = JOptionPane.showInputDialog("ID�Է�");
		String pw = JOptionPane.showInputDialog("PW�Է�");
		String name = JOptionPane.showInputDialog("NAME�Է�");
		String tel = JOptionPane.showInputDialog("TEL�Է�");
		
		DBó�� db = new DBó��();
		try {
			db.insert(id, pw, name, tel);
		} catch (Exception e) {
			System.out.println("�����߻�!!�����߻�!!");
			e.printStackTrace();
		}
	}
}
