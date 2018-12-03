package test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ThueGUI extends JFrame implements ActionListener 
{
	JLabel lblMaThue;
	JTextField tfMaThue;
	JButton btnDK;
	public ThueGUI() {
		lblMaThue = new JLabel();
		lblMaThue.setText("Mã Số Thuế");
		tfMaThue = new JTextField(40);
		btnDK = new JButton();
		btnDK.setText("Đăng Ký");
		//Báo nút sẽ xử lí sự kiện 
		btnDK.addActionListener(this);
	// Lấy content page frame để add các com
		Container cont = this.getContentPane();
		setSize(500, 500);
		//set layout
		cont.setLayout(new FlowLayout());
		cont.add(lblMaThue);
		cont.add(tfMaThue);
		cont.add(btnDK);
		// cho phep hien thi GUI
		setVisible(true);
	}
	//Viết hàm để khi bấm nút, sự kiện sẽ thực hiện
	public void actionPerformed(ActionEvent e)
	{
		//Hiển Thị Hộp Thoại
		JOptionPane.showConfirmDialog(null,"Hello"+tfMaThue.getText());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThueGUI obj = new ThueGUI();
	}

}
