package emp.management.sys;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;

public class AddEmployee extends JFrame implements ActionListener {
	Random hempid = new Random();
	int number = hempid.nextInt(9999);



	JTextField hname , hfathername, haddress,hAadharno,hPhoneNO ,hsalary,hdesignation,hemail
	,hpan;
	JLabel id;
	JDateChooser hdob;
	JComboBox education,hcountry,hgender;

	JButton hadd,hback;



	public AddEmployee() {

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

		hname = new JTextField();
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

		hAadharno = new JTextField();
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

		hdob = new JDateChooser();
		hdob.setBounds(600,150,200,30);
		hdob.setBackground(Color.white);
		add(hdob);
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


		String[] degree = {"B.Sc. – Bachelor of Science",
				"B.A. – Bachelor of Arts",
				"B.Com. – Bachelor of Commerce",
				"B.E. – Bachelor of Engineering",
				"B.Tech. – Bachelor of Technology",
				"M.Sc. – Master of Science",
				"M.A. – Master of Arts",
				"M.Com. – Master of Commerce",
				"M.E. – Master of Engineering",
				"M.Tech. – Master of Technology",
				"M.B.A. – Master of Business Administration",
				"Ph.D. – Doctor of Philosophy",
				"M.S. – Master of Science",
				"LL.B. – Bachelor of Laws",
				"LL.M. – Master of Laws",
				"M.D. – Doctor of Medicine",
				"B.D.S. – Bachelor of Dental Surgery",
				"B.Pharm. – Bachelor of Pharmacy",
				"M.Pharm. – Master of Pharmacy",
				"B.Arch. – Bachelor of Architecture",
		"M.Arch. – Master of Architecture"};
		education = new JComboBox(degree);
		education.setBounds(600,250,200,30);
		education.setBackground(Color.white);
		add(education);

		/*******************************/


		JLabel country = new JLabel("Country:");
		country.setBounds(450,300,150,30);
		country.setBackground(Color.WHITE);
		country.setFont(new Font("serif",Font.BOLD,25));
		add(country);

		String[] countries = {
				"Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua and Barbuda", "Argentina", "Armenia", "Australia", 
				"Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", 
				"Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina Faso", "Burundi", 
				"Cabo Verde", "Cambodia", "Cameroon", "Canada", "Central African Republic", "Chad", "Chile", "China", "Colombia", 
				"Comoros", "Congo", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", 
				"Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", 
				"Eswatini", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", 
				"Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", 
				"Indonesia", "Iran", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", 
				"Kiribati", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", 
				"Lithuania", "Luxembourg", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", 
				"Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", 
				"Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", 
				"North Korea", "North Macedonia", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", 
				"Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russia", "Rwanda", "Saint Kitts and Nevis", 
				"Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", 
				"Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", 
				"South Africa", "South Korea", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Sweden", "Switzerland", 
				"Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", 
				"Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", 
				"Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"
		};
		hcountry = new JComboBox(countries);
		hcountry.setBounds(600,300,150,30);
		hcountry.setBackground(Color.WHITE);
		hcountry.setFont(new Font("serif",Font.BOLD,20));
		add(hcountry);

		/*************************************/

		JLabel pan = new JLabel("Pancard No:");
		pan.setBounds(450,350,180,20);
		pan.setBackground(Color.WHITE);
		pan.setFont(new Font("serif",Font.BOLD,25));
		add(pan);

		hpan = new JTextField();
		hpan.setBounds(600,350,150,30);
		hpan.setBackground(Color.white);
		add(hpan);

		/*******************************/

		JLabel gender = new JLabel("Gender:");
		gender.setBounds(450,400,180,30);
		gender.setBackground(Color.WHITE);
		gender.setFont(new Font("serif",Font.BOLD,25));
		add(gender);

		String[] bool = {"Male","Female","NOT ABLE TO DISCLOSE"};

		hgender = new JComboBox(bool);
		hgender.setBounds(600,400,200,30);
		hgender.setBackground(Color.WHITE);
		hgender.setFont(new Font("serif",Font.BOLD,20));
		add(hgender);

		/**************************************/

		JLabel empid = new JLabel("EmpId:");
		empid.setBounds(450,450,180,30);
		empid.setBackground(Color.WHITE);
		empid.setFont(new Font("serif",Font.BOLD,29));
		add(empid);

		id = new JLabel(""+number);
		id.setBounds(600,450,200,30);
		id.setBackground(Color.WHITE);
		id.setFont(new Font("serif",Font.BOLD,29));
		add(id);

		/****************BUTTON SECTION***********************/

		hadd = new JButton("ADD");
		hadd.setBounds(450,550,150,30);
		hadd.setBackground(Color.BLACK);
		hadd.setForeground(Color.ORANGE);
		hadd.addActionListener(this);
		hadd.setFont(new Font("serif",Font.BOLD,30));
		add(hadd);


		hback = new JButton("BACK");
		hback.setBounds(250,550,150,30);
		hback.setBackground(Color.BLACK);
		hback.setForeground(Color.ORANGE);
		hback.addActionListener(this);
		hback.setFont(new Font("serif",Font.BOLD,30));
		add(hback);



		setSize(900,700);
		setLayout(null);
		setLocation(300, 90);
		setVisible(true);


	}

	public static void main(String[] args) {
		new AddEmployee();


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*JTextField hname , hfathername, haddress,hAadharno,hPhoneNO ,hsalary,hdesignation,hemail
	,hpan;
	JDateChooser hdob;
	JComboBox education,hcountry,hgender;*/
		if(e.getSource()==hadd) {
			String name=hname.getText();
			String fathername=hfathername.getText();
			String address=haddress.getText();
			String adharcard =hAadharno.getText();
			String phoneNO=hPhoneNO.getText();
			String salary =hsalary.getText();
			String designation=hdesignation.getText();
			String email=hemail.getText();
			String pancardNo = hpan.getText();
			String dateofBirth=((JTextField) hdob.getDateEditor().getUiComponent()).getText();
			String edu = (String) education.getSelectedItem();
			String country = (String) hcountry.getSelectedItem();
			String gender= (String) hgender.getSelectedItem();
			String empID = id.getText();

			try {
				Conn c = new Conn();
				String query = "insert into addEmployee values ('"+name+"', '"+fathername+"',"
						+ "'"+address+"','"+phoneNO+"','"+salary+"','"+designation+"','"+email+"',"
								+ "'"+pancardNo+"','"+dateofBirth+"','"+edu+"','"+country+"',"
										+ "'"+gender+"','"+empID+"','"+adharcard+"')";
				c.statements.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"Details added successfully!");
				setVisible(false);
				new Main_class();
				
			} catch (Exception e2) {
				e2.printStackTrace();			
				
			}



		}else if (e.getSource()==hback) {
			new Main_class();
			setVisible(false);
		}

	}

}
