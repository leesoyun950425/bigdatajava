import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginMain2 extends JPanel{
	private MainTest win;
	public LoginMain2(MainTest win) {
		this.win = win;
		
		setLayout(null);
		
		JLabel l1 = new JLabel("New label");
		l1.setFont(new Font("����", Font.BOLD, 20));
		l1.setBounds(84, 63, 244, 24);
		add(l1);
		
		JLabel lblNewLabel = new JLabel("\uB2D8 \uC758 \uD398\uC774\uC9C0\uC785\uB2C8\uB2E4.");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel.setBounds(84, 91, 281, 33);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uC218\uC815");
		btnNewButton.setBounds(68, 144, 97, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				win.change("LoginMain");
			}
		});
		btnNewButton_1.setBounds(188, 144, 97, 23);
		add(btnNewButton_1);
	}
}
