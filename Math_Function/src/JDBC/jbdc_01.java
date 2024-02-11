package JDBC;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jbdc_01 {

	public static void main(String[] args) throws Exception  {
		
		
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hpdb", "root", "manager");
			
			 Statement st = (Statement) con.createStatement();
			 
			 
	}

}
