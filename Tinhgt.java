package test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tinhgt extends JFrame implements ActionListener
{
	JLabel lblSoN;
	JTextField tfSoN;
	JLabel lblKetQua;
	JTextField tfKetQua;
	JButton btnTinhgt;
	public Tinhgt() {
		lblSoN = new JLabel();
		lblSoN.setText("Số N");
		tfSoN = new JTextField(10);
		lblKetQua = new JLabel();
		lblKetQua.setText("Kết Quả");
		tfKetQua = new JTextField(10);
		btnTinhgt = new JButton();
		btnTinhgt.setText("Tính GT");
		btnTinhgt.addActionListener(this);
		Container cont = this.getContentPane();
		setSize(400, 200);
		cont.setLayout(new FlowLayout());
		cont.add(lblSoN);
		cont.add(tfSoN);
		cont.add(lblKetQua);
		cont.add(tfKetQua);
		cont.add(btnTinhgt);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
	//Lấy dữ liệu từ textfield SoN
		String SoN = tfSoN.getText();
		int n = Integer.parseInt(SoN);
		int Tich = 1;
		for (int i=2;i<=n;i++)
		{
			Tich=Tich*i;
		}
		tfKetQua.setText(String.valueOf(Tich));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tinhgt obj = new Tinhgt();
	}


}
