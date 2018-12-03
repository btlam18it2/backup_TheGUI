package test;

import java.awt.Container;
import java.awt.Desktop.Action;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Stream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tong1chiaN extends JFrame	implements ActionListener {
	JLabel lblsoN;
	JTextField tfsoN;
	JLabel lblketqua;
	JTextField tfketqua;
	JButton btnTongchiaN;
	
	public Tong1chiaN()
	{
		lblsoN = new JLabel();
		lblsoN.setText("Số N");
		tfsoN = new JTextField(20);
		lblketqua = new JLabel();
		lblketqua.setText("Kết quả ");
		tfketqua = new JTextField(20);
		btnTongchiaN = new JButton();
		btnTongchiaN.setText("Tổng 1/N");
		btnTongchiaN.addActionListener(this);
		
		Container cont = this.getContentPane();
		setSize(400, 400);
		cont.setLayout(new FlowLayout());
		cont.add(lblsoN);
		cont.add(tfsoN);
		cont.add(lblketqua);
		cont.add(tfketqua);
		cont.add(btnTongchiaN);
		setVisible(true);
	}
		public void actionPerformed(ActionEvent e)
		{
			String soN = tfsoN.getText();
			int n = Integer.parseInt(soN);
			float Tong =1;
			for(int i=1;i<=n;i++)
			{
				Tong=(float)Tong+1/i;
			}
				tfketqua.setText(String.valueOf(Tong));
		}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tong1chiaN obj = new Tong1chiaN ();
	}

}
