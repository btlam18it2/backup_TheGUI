package test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class StudentGUI extends JFrame
{
	JLabel lbluser;
	JTextField tfuser;
	JLabel lblpass;
	JPasswordField tfpass;
	JLabel lblgender;
	JRadioButton rdomale;
	JRadioButton rdofemale;
	ButtonGroup bg;
	JComboBox cbohome;
	JButton btnregist;
	
	public StudentGUI ()
	{
		lbluser = new JLabel("UserName");
		tfuser = new JTextField(10);
		lblpass = new JLabel("PassWord");
		tfpass = new JPasswordField(10);
		lblgender = new JLabel("Gender");
		rdomale = new JRadioButton("Male");
		rdofemale = new JRadioButton("Female");
		bg = new ButtonGroup();
		bg.add(rdomale);
		bg.add(rdofemale);
		cbohome = new JComboBox();
		cbohome.addItem("Đà Nẵng");
		cbohome.addItem("Huế");
		cbohome.addItem("Hà Nội");
		cbohome.addItem("Hải Phòng");
		btnregist = new JButton();
		btnregist.setText("Register");
		btnregist.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//lấy giới tính
				String gt="";
				if (rdomale.isSelected()==true) gt=rdomale.getText();
				else gt= rdofemale.getText();
				//lấy giá trị tại item mà combobox đang được chọn
				String home = (String) cbohome.getSelectedItem();
				JOptionPane.showMessageDialog(null,"User is "+tfuser.getText()
															+"\nAnd Pass: "+tfpass.getText()
															+"\nGender: "+gt
															+"\nHome: "+home);
			}
			
		});
		//tạo container để add các component
		Container cont = getContentPane();
		setSize(400, 300);
		setLayout(new FlowLayout());
		cont.add(lbluser);
		cont.add(tfuser);
		cont.add(lblpass);
		cont.add(tfpass);
		cont.add(lblgender);
		cont.add(rdomale);
		cont.add(rdofemale);
		cont.add(cbohome);
		cont.add(btnregist);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StudentGUI();
	}

}
