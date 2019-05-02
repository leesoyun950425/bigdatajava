package JDBC;

import javax.swing.JOptionPane;

public class DB입력수정 {

	public static void main(String[] args) {
		String telUp = JOptionPane.showInputDialog("변경후 전화번호");
		String idUp = JOptionPane.showInputDialog("변경할 ID");
	
		DB처리Test db1 = new DB처리Test();
		try {
			db1.update(telUp, idUp);
		} catch (Exception e) {
			System.out.println("에러발생!");
			e.printStackTrace();
		}
	}
}
