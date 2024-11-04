package emp.management.sys;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UpdateEmployee extends JFrame implements ActionListener {

	JTextField heduaction, hfathername, haddress,hcountry,hPhoneNO ,hsalary,hdesignation,hemail
	,hpan;
	JLabel id;
	
	JButton Update,back;
	String number ;
	
	public UpdateEmployee(String number) {
		this.number=number;
		
		getContentPane().setBackground(new Color(184, 196, 209));

		JLabel heading = new JLabel("ADD EMPLOYEE DETAILS");
		heading.setBounds(220,50,550,50);
		heading.setFont(new Font("serif",Font.BOLD,40));
		add(heading);

		JLabel name = new JLabel("NAME:");
		name.setBounds(40,150,150,20);
		name.setBackground(Color.WHITE);
		name.setFont(new Font("serif",Font.BOLD,25));
		add(name);

		JLabel hname = new JLabel();
		hname.setBounds(200,150,150,30);
		hname.setBackground(Color.white);
		add(hname);

		/****************************************/
		JLabel fathername = new JLabel("Father Name:");
		fathername.setBounds(40,200,150,30);
		fathername.setBackground(Color.white);
		fathername.setFont(new Font("serif",Font.BOLD,25));
		add(fathername);

		hfathername = new JTextField();
		hfathername.setBounds(200,200,150,30);
		hfathername.setBackground(Color.white);
		add(hfathername);

		/****************************/

		JLabel pNO = new JLabel("Phone NO:");
		pNO.setBounds(40,250,150,30);
		pNO.setBackground(Color.white);
		pNO.setFont(new Font("serif",Font.BOLD,25));
		add(pNO);

		hPhoneNO = new JTextField();
		hPhoneNO.setBounds(200,250,150,30);
		hPhoneNO.setBackground(Color.white);
		add(hPhoneNO);

		/****************************/

		JLabel address = new JLabel("Address:");
		address.setBounds(40,300,150,30);
		address.setBackground(Color.white);
		address.setFont(new Font("serif",Font.BOLD,25));
		add(address);

		haddress = new JTextField();
		haddress.setBounds(200,300,150,30);
		haddress.setBackground(Color.white);
		add(haddress);

		/****************************/

		JLabel adhar = new JLabel("ADHAR NO:");
		adhar.setBounds(40,350,150,30);
		adhar.setBackground(Color.white);
		adhar.setFont(new Font("serif",Font.BOLD,25));
		add(adhar);

		JLabel hAadharno = new JLabel();
		hAadharno.setBounds(200,350,150,30);
		hAadharno.setBackground(Color.white);
		add(hAadharno);

		/****************************/


		JLabel sal = new JLabel("SALARY:");
		sal.setBounds(40,400,150,30);
		sal.setBackground(Color.white);
		sal.setFont(new Font("serif",Font.BOLD,25));
		add(sal);

		hsalary = new JTextField();
		hsalary.setBounds(200,400,150,30);
		hsalary.setBackground(Color.white);
		add(hsalary);

		/****************************/

		JLabel desig = new JLabel("Designation:");
		desig.setBounds(40,450,150,30);
		desig.setBackground(Color.white);
		desig.setFont(new Font("serif",Font.BOLD,25));
		add(desig);

		hdesignation = new JTextField();
		hdesignation.setBounds(200,450,150,30);
		hdesignation.setBackground(Color.white);
		add(hdesignation);

		/*************2row ***************/

		JLabel dob = new JLabel("Date Of Birth:");
		dob.setBounds(450,150,150,20);
		dob.setBackground(Color.WHITE);
		dob.setFont(new Font("serif",Font.BOLD,25));
		add(dob);

		JLabel tdob = new JLabel();
		tdob.setBounds(600,150,150,20);
		tdob.setFont(new Font("serif",Font.BOLD,25));
		add(tdob);
		
		/*******************************/


		JLabel email = new JLabel("Email:");
		email.setBounds(450,200,150,20);
		email.setBackground(Color.WHITE);
		email.setFont(new Font("serif",Font.BOLD,25));
		add(email);

		hemail = new JTextField();
		hemail.setBounds(600,200,200,30);
		hemail.setBackground(Color.white);
		add(hemail);

		/*******************************/

		JLabel edu = new JLabel("Education:");
		edu.setBounds(450,250,150,20);
		edu.setBackground(Color.WHITE);
		edu.setFont(new Font("serif",Font.BOLD,25));
		add(edu);
		
		
		heduaction= new JTextField();
		heduaction.setBounds(600,250,150,30);
		heduaction.setBackground(Color.white);
		add(heduaction);

		/*******************************/


		JLabel country = new JLabel("Country:");
		country.setBounds(450,300,150,30);
		country.setBackground(Color.WHITE);
		country.setFont(new Font("serif",Font.BOLD,25));
		add(country);

		hcountry = new JTextField();
		hcountry.setBounds(600,300,150,30);
		hcountry.setBackground(Color.white);
		add(hcountry);
		
		

		/*************************************/

		JLabel pan = new JLabel("Pancard No:");
		pan.setBounds(450,350,180,20);
		pan.setBackground(Color.WHITE);
		pan.setFont(new Font("serif",Font.BOLD,25));
		add(pan);

		JLabel hpan = new JLabel();
		hpan.setBounds(600,350,150,30);
		hpan.setBackground(Color.white);
		add(hpan);

		/*******************************/

		JLabel gender = new JLabel("Gender:");
		gender.setBounds(450,400,180,30);
		gender.setBackground(Color.WHITE);
		gender.setFont(new Font("serif",Font.BOLD,25));
		add(gender);
		
		JLabel GEN = new JLabel();
		GEN.setBounds(630,400,150,30);
		GEN.setBackground(Color.white);
		add(GEN);

		
		/**************************************/

		JLabel empid = new JLabel("EmpId:");
		empid.setBounds(450,450,180,30);
		empid.setBackground(Color.WHITE);
		empid.setFont(new Font("serif",Font.BOLD,29));
		add(empid);

		id = new JLabel();
		id.setBounds(600,450,200,30);
		id.setBackground(Color.WHITE);
		id.setFont(new Font("serif",Font.BOLD,29));
		add(id);
		
		
		try {
			Conn c = new Conn();
			String Query = "select * from addEmployee where empID = '"+number+"'";
			ResultSet rs = c.statements.executeQuery(Query);
			while(rs.next()) {
				hname.setText(rs.getString("NAME"));
				hfathername.setText(rs.getString("FATHERNAME"));
				haddress.setText(rs.getString("ADDRESS"));
				hPhoneNO.setText(rs.getString("PHONENO"));
				hsalary.setText(rs.getString("SALARY"));
				hdesignation.setText(rs.getString("DESIGNATION"));
				hemail.setText(rs.getString("EMAIL"));
				hpan.setText(rs.getString("PANCARDNUMBER"));
				tdob.setText(rs.getString("DOB"));
				heduaction.setText(rs.getString("EDUCATION"));
				hcountry.setText(rs.getString("COUNTRY"));
				GEN.setText(rs.getString("GENDER"));
				id.setText(rs.getString("EMPID"));
				hAadharno.setText(rs.getString("ADHARCARDNO"));
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		/****************BUTTON SECTION***********************/

		Update = new JButton("UPDATE");
		Update.setBounds(450,550,180,30);
		Update.setBackground(Color.BLACK);
		Update.setForeground(Color.ORANGE);
		Update.addActionListener(this);
		Update.setFont(new Font("serif",Font.BOLD,30));
		add(Update);


		back = new JButton("BACK");
		back.setBounds(250,550,150,30);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.ORANGE);
		back.addActionListener(this);
		back.setFont(new Font("serif",Font.BOLD,30));
		add(back);



		setSize(900,700);
		setLayout(null);
		setLocation(300, 90);
		setVisible(true);
		
		
		
		
		
	}
	public static void main(String[] args) {
		new UpdateEmployee("");
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Update) {
			String fathername = hfathername.getText();
			String phoneNo = hPhoneNO.getText();
			String address = haddress.getText();
			String salary = hsalary.getText();
			String designation = hdesignation.getText();
			String email = hemail.getText();
			String education = heduaction.getText();
			String country = hcountry.getText();
			
			try {
				Conn c = new Conn();
				String query = "update addEmployee set FATHERNAME = '"+fathername+"',PHONENO='"+phoneNo+"',"
						+ "ADDRESS = '"+address+"',SALARY = '"+salary+"',DESIGNATION = '"+designation+"',"
								+ "EMAIL='"+email+"',EDUCATION = '"+education+"',COUNTRY = '"+country+"'"
										+ "where EMPID = '"+number+"'";
				c.statements.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"Details update Sucessfully!");
				setVisible(false);
				new Main_class();
			
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			
		}
		else if(e.getSource()==back) {
			setVisible(false);
			new ViewEmployee();
			
		}
	}
}
