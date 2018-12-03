package test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class baitapGUI extends JFrame
{
	JLabel lblSoN;
	JTextField tfSoN;
	JLabel lblKetqua;
	JTextField tfKetqua;
	JButton btnTinhgt;
	JButton btnTinhcan;
	public baitapGUI()
	{
		lblSoN = new JLabel();
		lblSoN.setText("Số N");
		tfSoN = new JTextField(10);
		lblKetqua = new JLabel();
		lblKetqua.setText("Kết Quả");
		tfKetqua = new JTextField(10);
		btnTinhgt = new JButton();
		btnTinhgt.setText("Tính gt");
		btnTinhcan = new JButton();
		btnTinhcan.setText("Tính Căn");
			btnTinhgt.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String SoN = tfSoN.getText();
					int n = Integer.parseInt(SoN);
					float  Tich = 1;
					for (int i=1;i<=n;i++)
					{
						Tich=Tich*i;
					}
					tfKetqua.setText(String.valueOf(Tich));
				}
			});
			btnTinhcan.addActionListener(new ActionListener()
			{
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String soN = tfSoN.getText();
					int m = Integer.parseInt(soN);
					float Tongcan =0;
					for (int i=1;i<=m;i++)
					{
						Tongcan+=(float)Math.sqrt(i);
					}
					tfKetqua.setText(String.valueOf(Tongcan));
				}
			});
		Container cont = getContentPane();
		setSize(300, 400);
		setLayout(new FlowLayout());
		cont.add(lblSoN);
		cont.add(tfSoN);
		cont.add(lblKetqua);
		cont.add(tfKetqua);
		cont.add(btnTinhgt);
		cont.add(btnTinhcan);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new baitapGUI();
	}

}
