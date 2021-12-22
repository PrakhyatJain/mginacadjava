/**
 * 
 */
package main.java.com.academic.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Ramesh Karuti
 * 
 */
public class UpdateDemo {
	Connection con;
	Statement smt;
	ResultSet rs;

	public void Demo() {
		try {

			int i = 0;
			Class.forName("com.mysql.jdbc.Driver");
			String s = "arun";
			String p = "cat";
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/demo", "root", "admin");
			String query = "update login set pass = 'welcome' where name='rose'";
			smt = con.createStatement();
			smt.executeUpdate(query);
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
		UpdateDemo t = new UpdateDemo();
		t.Demo();

	}

}