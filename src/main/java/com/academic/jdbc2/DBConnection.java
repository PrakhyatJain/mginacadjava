/**
 * 
 */
package main.java.com.academic.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author ramesh
 *
 */
public class DBConnection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DBConnection.getDBConnection();

	}

	public static Connection getDBConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");// 1 Load the driver
			con = DriverManager.getConnection("jdbc:mysql://localhost/megainfo", "root", ""); // 2 Make the
																								// connection
			System.out.println("Connection Success!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
