package emp.management.sys;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RemoveEmployee extends JFrame implements ActionListener{
	
	Choice choiceEMPID;
	JButton remove ,back;
	
	
	
	public RemoveEmployee(){
		
		
		JLabel heading = new JLabel("REMOVE EMPLOYEE");
		heading.setBounds(380,20,250,40);
		heading.setFont(new Font("serif",Font.BOLD,20));
		add(heading);
		
		JLabel empid = new JLabel("EMPLOYEE ID :");
		empid.setBounds(50,100,180,30);
		empid.setFont(new Font("serif",Font.BOLD,20));
		add(empid);
		
		choiceEMPID = new Choice();
		choiceEMPID.setBounds(250,100,150,30);
		add(choiceEMPID);
		
		
		try {
			
			Conn c = new Conn();
			ResultSet rs = c.statements.executeQuery("select * from addEmployee");
			while(rs.next()) {
				choiceEMPID.add(rs.getString("EMPID"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		JLabel name = new JLabel("Name:");
		name.setBounds(50, 150,150,30);
		name.setFont(new Font("Tahoma",Font.BOLD,25));
		add(name);
		
		JLabel textname = new JLabel();
		textname.setBounds(250,150,150,30);
		//name.setFont(new Font("serif",Font.BOLD,25));
		add(textname);
		
		/************************************/
		JLabel email = new JLabel("Email:");
		email.setBounds(50, 200,150,30);
		email.setFont(new Font("Tahoma",Font.BOLD,25));
		add(email);
		
		JLabel textemail = new JLabel();
		textemail.setBounds(250,200,250,30);
		//textemail.setFont(new Font("serif",Font.BOLD,25));
		add(textemail);
		
		/********************************/
		
		JLabel phone = new JLabel("Phone:");
		phone.setBounds(50, 250,150,30);
		phone.setFont(new Font("Tahoma",Font.BOLD,25));
		add(phone);
		
		JLabel textphone = new JLabel();
		textphone.setBounds(250,250,200,30);
		//textphone.setFont(new Font("serif",Font.BOLD,25));
		add(textphone);
		
		try {
			
			Conn c = new Conn();
			ResultSet rs = c.statements.executeQuery("select * from addEmployee where EMPID = '"+choiceEMPID.getSelectedItem()+"'");
			while (rs.next()) {
				textname.setText(rs.getString("NAME"));
				textemail.setText(rs.getString("EMAIL"));
				textphone.setText(rs.getString("PHONENO"));
				
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		//for choice which id data to be visible so use additemlisterner()
		
		choiceEMPID.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				try {
					Conn c = new Conn();
					ResultSet rs = c.statements.executeQuery("select * from addEmployee where EMPID = '"+choiceEMPID.getSelectedItem()+"'");
					while (rs.next()) {
						textname.setText(rs.getString("NAME"));
						textemail.setText(rs.getString("EMAIL"));
						textphone.setText(rs.getString("PHONENO"));
						
						
					}
					
				} catch (Exception e2) {
					
					e2.printStackTrace();
					
				}
				
				
			}
		});
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		/************************************/
		
		remove = new JButton("REMOVE");
		remove.setBounds(100, 350,150,30);
		remove.setBackground(Color.BLACK);
		remove.setForeground(Color.white);
		remove.addActionListener(this);
		add(remove);
		
		back = new JButton("BACK");
		back.setBounds(350, 350,150,30);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.white);
		back.addActionListener(this);
		add(back);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
		Image i2 = i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel img = new JLabel(i3);
		img.setBounds(550,80,300,350);
		add(img);
		
		ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/rback.png"));
		Image i22 = i11.getImage().getScaledInstance(900,500,Image.SCALE_DEFAULT);
		ImageIcon i33 = new ImageIcon(i22);
		JLabel image = new JLabel(i33);
		image.setBounds(0,0,900,500);
		add(image);
		
		
		
		
		setSize(900,500);
		setLayout(null);
		setLocation(200,100);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new RemoveEmployee();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==remove) {
		
			try {
				Conn c = new Conn();
				c.statements.executeUpdate("delete from AddEmployee where EMPID ='"+choiceEMPID.getSelectedItem()+"'");
				JOptionPane.showMessageDialog(null,"details deleted sucessfully");
				setVisible(false);
				new ViewEmployee();
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}
		}
		else {
			setVisible(false);
			new ViewEmployee();
		}
		
	}

}
