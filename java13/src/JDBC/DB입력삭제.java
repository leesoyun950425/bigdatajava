package JDBC;

import javax.swing.JOptionPane;

public class DB�Է»��� {

	public static void main(String[] args) {
		String idDe = JOptionPane.showInputDialog("������ ID");
		
		DBó��Test2 db = new DBó��Test2();
		
		try {
			db.delete(idDe);
		} catch (Exception e) {
			System.out.println("�����߻�!");
			e.printStackTrace();
		}
	}
}
