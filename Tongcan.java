package test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tongcan extends JFrame implements ActionListener
{
	JLabel lblsoN;
	JTextField tfsoN;
	JLabel lblketqua;
	JTextField tfketqua ;
	JButton btnTongcan;
	public Tongcan()
	{
		lblsoN = new JLabel();
		lblsoN.setText("Số N");
		tfsoN = new JTextField(20);
		lblketqua = new JLabel();
		lblketqua.setText("Kết Quả ");
		tfketqua = new JTextField(20);
		btnTongcan = new JButton();
		btnTongcan.setText("Tổng căn");
		btnTongcan.addActionListener(this);
		Container cont = this.getContentPane();
		setSize(400, 400);
		cont.setLayout(new FlowLayout());
		cont.add(lblsoN);
		cont.add(tfsoN);
		cont.add(lblketqua);
		cont.add(tfketqua);
		cont.add(btnTongcan);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ev)
	{
			String soN = tfsoN.getText();
			int m = Integer.parseInt(soN);
			float Tongcan =0;
			for (int i=1;i<=m;i++)
			{
				Tongcan+=(float)Math.sqrt(i);
			}
			tfketqua.setText(String.valueOf(Tongcan));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tongcan obj = new Tongcan();
	}

}
