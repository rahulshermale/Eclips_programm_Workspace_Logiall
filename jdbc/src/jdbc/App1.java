package jdbc;

import java.sql.*;

public class App1 {
	public static void main(String args[]) {
		String ss = "jdbc:mysql://localhost:3306/hpdb";
		Connection con = null;
		try {
			con = DriverManager.getConnection(ss, "root", "manager");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//System.out.println("Implementation class is\t"+con.getClass()); 
		Statement st = null;
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResultSet rs = null;
		try {
			rs = st.executeQuery("select * from dept");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while (rs.next()) {
				int no = rs.getInt("deptno");
				String name = rs.getString("dname");
				String add = rs.getString("loc");
				System.out.println(no + "\t" + name + "\t" + add);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
