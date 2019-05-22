package 인터페이스_복습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionProcess2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("2번 버튼을 눌렀군요.");
	}
}
