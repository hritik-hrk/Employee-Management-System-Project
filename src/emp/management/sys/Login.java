package emp.management.sys;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{


	//JTextfield to take user input So declare global and Password becauase take and match with databsee
	JTextField tusername;
	JPasswordField tpassword;
	JButton Login;
	JButton Back;


	Login(){

		//Username
		JLabel username = new JLabel("CompanyName:");
		username.setBounds(40,20,100,30);
		add(username);


		tusername=new JTextField();
		tusername.setBounds(150,20,200,30);
		add(tusername);


		//password
		JLabel password = new JLabel("Password");
		password.setBounds(40,70,100,30);
		add(password);

		tpassword = new JPasswordField();
		tpassword.setBounds(150,70,200,30);
		add(tpassword);

		//button to submit 

		Login = new JButton("LOGIN");
		Login.setBounds(40,140, 100,30);
		Login.setBackground(Color.black);
		Login.setForeground(Color.white);//for text color change
		Login.addActionListener(this);//to futher whathappens next ...
		add(Login);

		//button to back 
		Back = new JButton("BACK");
		Back.setBounds(180,140, 100,30);
		Back.setBackground(Color.black);
		Back.setForeground(Color.white);
		Back.addActionListener(this);//to exit the program by click
		add(Back);


		//background Image 
		ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));

		Image I2 = I1.getImage().getScaledInstance(650,400,Image.SCALE_DEFAULT);

		ImageIcon I3 = new ImageIcon(I2);

		JLabel bgImage = new JLabel(I3);
		bgImage.setBounds(370,10,650,400);
		add(bgImage);


		//background color 
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/LoginB.jpg"));

		Image i2 = i1.getImage().getScaledInstance(600, 300,Image.SCALE_DEFAULT);

		ImageIcon i3 = new ImageIcon(i2);

		JLabel bgcolorImage = new JLabel(i3);
		bgcolorImage.setBounds(0,0,600,300);
		add(bgcolorImage);



		setSize(600, 300);
		setLocation(450, 300);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Login) {

			try {
				String username = tusername.getText();

				String password = tpassword.getText();

				Conn c = new Conn();

				String Query="select * from login where username ='"+username+"' and password = '"+password+"'";


				ResultSet rs = c.statements.executeQuery(Query);


				if (rs.next()) {
					setVisible(false);
					new Main_class();
				} else {
					JOptionPane.showMessageDialog(null,"Invalid user id and password");
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}

		}else if(e.getSource()==Back) {
			System.exit(0);
		}

	}
	public static void main(String[] args) {
		new Login();

	}



}
