package main.java.com.academic.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Ramesh Karuti
 * 
 */
public class InsertPreDemo {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	public void Demo() {
		try {
			int i = 0;
			Class.forName("com.mysql.jdbc.Driver");
			String s = "arun";
			String p = "cat22";
			con = DriverManager.getConnection("jdbc:mysql://localhost/megainfoware", "root", "admin");
			String query = "insert into emp_details values (?, ?, ?,?,?,?)";
			ps = con.prepareStatement(query);
			ps.setString(1, "MI1003");
			ps.setString(2, "vijay");
			ps.setString(3, "s");
			ps.setString(4, "vijay@yahoo.com");
			ps.setString(5, "7586747635");
			ps.setString(6, "Blr");
			int x = ps.executeUpdate();
			System.out.println("Values inserted "+x);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		InsertPreDemo t = new InsertPreDemo();
		t.Demo();
	}
}
