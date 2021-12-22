package main.java.com.academic.jdbc2;

import java.sql.*;

/**
 * @author Ramesh Karuti
 * 
 */
public class SelectPreDemo {

	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public void selectDemo() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/studentdb", "root", "admin");
			ps = con.prepareStatement("select * from login");
			rs = ps.executeQuery();
			
			while (rs.next()) {
				String num = rs.getString("user");
				String name = rs.getString(2);
				System.out.println("The name and password is " + num + " "
						+ name);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			rs.close();
			ps.close();
			con.close();
		}
	}

	public static void main(String[] args) throws Exception {
		SelectPreDemo t = new SelectPreDemo();
		t.selectDemo();

	}

}
