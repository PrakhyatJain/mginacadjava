/**
 * 
 */
package main.java.com.academic.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Ramesh Karuti
 * 
 */
public class DeletePreDemo {
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
					"jdbc:mysql://localhost/studentdb", "root", "admin");
			String query = "delete from login where pass='ball'";
			ps = con.prepareStatement(query);
			ps.executeUpdate();
			System.out.println("Value Deleted Successfully! ");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		DeletePreDemo t = new DeletePreDemo();
		t.Demo();

	}

}