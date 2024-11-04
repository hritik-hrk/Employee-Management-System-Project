package emp.management.sys;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main_class  extends JFrame{


	JButton add,view,remove ,exit;

	public Main_class() {

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));

		Image i2 = i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);

		ImageIcon i3 = new ImageIcon(i2);

		JLabel img = new JLabel(i3);

		img.setBounds(0,0,1200,600);

		add(img);

		JLabel heading = new JLabel("Employee Management System");
		heading.setBounds(340,150,600,50);
		heading.setFont(new Font("serif",Font.BOLD,30));
		img.add(heading);



		add = new JButton("Add Employee");
		add.setBounds(375,240,150,30);
		add.setForeground(Color.white);
		add.setBackground(Color.black);
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new AddEmployee();
				setVisible(false);

			}
		});

		img.add(add);


		view = new JButton("View Employee");
		view.setBounds(585,240,150,30);
		view.setForeground(Color.white);
		view.setBackground(Color.black);
		view.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ViewEmployee();
				setVisible(false);

			}
		});

		img.add(view);

		remove = new JButton("Remove Employee");
		remove.setBounds(485,300,150,30);
		remove.setForeground(Color.PINK);
		remove.setBackground(Color.black);
		remove.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new RemoveEmployee();
				setVisible(false);


			}
		});

		img.add(remove);

		exit = new JButton("Exit");
		exit.setBounds(720,400,100,30);
		exit.setForeground(Color.red);
		exit.setBackground(Color.black);
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);

			}
		});

		img.add(exit);









		setSize(1200,600);
		setBounds(170, 150, 1200, 600);
		setLocation(250, 100);
		setLayout(null);
		setVisible(true);


	}
	public static void main(String[] args) {
		new Main_class();

	}

}
