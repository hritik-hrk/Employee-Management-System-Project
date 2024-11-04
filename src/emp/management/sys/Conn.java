package emp.management.sys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JFrame;


public class Conn{
	Connection connection;
	Statement statements;


	public Conn(){

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url ="jdbc:oracle:thin:@localhost:1521:ORCLHRK";
			String username = "SCOTT"; 
			String password = "hritik";
			connection = DriverManager.getConnection(url,username,password);
			statements = connection.createStatement();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();

		}

	}
}
