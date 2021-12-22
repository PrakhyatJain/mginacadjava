/**
 * 
 */
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
public class UpdatePreDemo {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public void Demo() {
		try {

			int i = 0;
			Class.forName("com.mysql.jdbc.Driver");
			String s = "arun";
			String p = "cat";
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/demo", "root", "admin");
			String query = "update login set name = 'pavitra' where pass='helo'";
			ps = con.prepareStatement(query);
			ps.executeUpdate(query);
			System.out.println("Values updated! "+i);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		UpdatePreDemo t = new UpdatePreDemo();
		t.Demo();

	}

}