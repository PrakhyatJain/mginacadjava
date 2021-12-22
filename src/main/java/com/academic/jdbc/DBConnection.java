package main.java.com.academic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	/**
	 * Method to get the connection
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName(JDBCConstants.DRIVER_NAME);
		Connection con = DriverManager.getConnection(JDBCConstants.DB_URL, 
													 JDBCConstants.USER_NAME,
													 JDBCConstants.PASSWORD);
		return con;
	}

}
