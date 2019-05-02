package JDBC;

import javax.swing.JOptionPane;

public class DB입력삭제 {

	public static void main(String[] args) {
		String idDe = JOptionPane.showInputDialog("삭제할 ID");
		
		DB처리Test2 db = new DB처리Test2();
		
		try {
			db.delete(idDe);
		} catch (Exception e) {
			System.out.println("오류발생!");
			e.printStackTrace();
		}
	}
}
