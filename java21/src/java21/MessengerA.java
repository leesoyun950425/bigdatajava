package java21;

import java.awt.BorderLayout;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MessengerA extends JFrame{
	JTextArea list;
	JTextField input;
	DatagramSocket socket;
	
	public MessengerA() throws Exception {
		socket = new DatagramSocket(5000);
		
		list = new JTextArea(6,20);
		list.setFont(new Font("���� ���", Font.BOLD, 25));
		list.setForeground(new Color(255, 255, 255));
		list.setBackground(new Color(25, 25, 112));
		
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String str = input.getText();
//				System.out.println("���� �Է��� �� : "+data);
				list.append("���� �Է� >> " +str + "\n");
				input.setText("");
				
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					//�������� ��Ŷ�� �����Ѵ�.
					byte[] data = str.getBytes();
					InetAddress ip = InetAddress.getByName("192.168.0.130"); //�ڱ��ڽ��� ��Ÿ���� ���� ip
					DatagramPacket packet = new DatagramPacket(data,data.length,ip,5000);
					
					socket.send(packet);
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		input.setFont(new Font("�������", Font.BOLD, 20));
		input.setForeground(new Color(255, 255, 255));
		input.setBackground(new Color(100, 149, 237));
		setTitle("�޽���A ä��ȭ��");
		getContentPane().add(list,BorderLayout.CENTER);
		getContentPane().add(input, BorderLayout.SOUTH);
		pack();
		
		list.setEditable(false);  //�� ���� ���°�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //���� �������� ���α׷� �����°�
		
		setVisible(true);
	}
	public void process() throws Exception {
		//��Ŷ �޴� �ڵ�(���� ����)
		while(true) {
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data,data.length);
			socket.receive(packet);
			list.append("��� �Է�>>" + new String(data)+"\n");
		}
	}
	
	public static void main(String[] args) throws Exception {
		MessengerA name = new MessengerA();
		name.process(); //������ ���� �޴� �ڵ尡 ���� ���ư��� ��.
	}
}
