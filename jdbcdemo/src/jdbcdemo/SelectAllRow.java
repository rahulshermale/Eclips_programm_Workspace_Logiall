package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllRow {
	public static void main(String[] args) {

		String ss = "jdbc:mysql://localhost:3306/movies";
		try {
			Connection con = DriverManager.getConnection(ss, "root", "manager");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from movies");
			while (rs.next()) {
				System.out
						.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}