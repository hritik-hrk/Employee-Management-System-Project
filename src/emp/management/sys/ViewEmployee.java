package emp.management.sys;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class ViewEmployee extends JFrame implements ActionListener {

	Choice chempid;
	JTable table ;
	JButton search , print ,update,back;


	public ViewEmployee() {

		getContentPane().setBackground(new Color(196, 176, 96));


		JLabel heading = new JLabel("VIEW EMPLOYEE DETAILS");
		heading.setBounds(280,20,450,40);
		heading.setFont(new Font("serif",Font.BOLD,30));
		heading.setBackground(Color.BLACK);
		add(heading);

		JLabel Search = new JLabel("SEARCH EMPLOYEE DETAILS BY EMPID");
		Search.setBounds(50,100,250,30);
		add(Search);


		chempid = new Choice();
		chempid.setBounds(320,100,150,30);
		add(chempid);

		try {
			Conn c = new Conn();

			ResultSet rs = c.statements.executeQuery("select * from addEmployee");
			while (rs.next()) {
				chempid.add(rs.getString("empID"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		/*****************TABLE****************/
		

		table = new JTable();
		
		try {
			Conn c = new Conn();
			ResultSet rs = c.statements.executeQuery("select * from addEmployee");
			table.setModel(DbUtils.resultSetToTableModel(rs));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		JScrollPane js = new JScrollPane(table);
		js.setBounds(0,200,1100,700);
		add(js);
		
		/*****************************************/

		search = new JButton("Search");
		search.setBounds(50,150,100,20);
		search.addActionListener(this);
		add(search);
		
		print = new JButton("Print");
		print.setBounds(170,150,100,20);
		print.addActionListener(this);
		add(print);
		
		update = new JButton("Update");
		update.setBounds(290,150,100,20);
		update.addActionListener(this);
		add(update);
		
		back = new JButton("Back");
		back.setBounds(410,150,100,20);
		back.addActionListener(this);
		add(back);
		

		
		setSize(1100,700);
		setLocation(300, 70);
		setLayout(null);
		setVisible(true);

	}
	public static void main(String[] args) {
		new ViewEmployee();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==search) {
			
			String query = "select * from addEmployee where empID ='"+chempid.getSelectedItem()+"'";
			
			try {
				
				Conn c = new Conn();
				ResultSet rs = c.statements.executeQuery(query);
				table.setModel(DbUtils.resultSetToTableModel(rs));
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		else if(e.getSource() == print) {
			try {
				table.print();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		else if(e.getSource() == update) {
				setVisible(false);
				new UpdateEmployee(chempid.getSelectedItem());	
			
		}
		else {
		
			setVisible(false);
			new Main_class();
			
		}
		
	}

}
