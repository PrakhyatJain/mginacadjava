/**
 * 
 */
package main.java.com.academic.jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

/**
 * @author megainfo
 *
 */
public class ConnectionObj {

	/**
	 * @param args
	 */
	Connection connection;
	Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/megainfo","root","admin");	
			//Statement smt = connection.createStatement();
			PreparedStatement ps = connection.prepareStatement("select * from demo where name=?");
			//ResultSet rs = smt.executeQuery("select * from demo");
			ps.setString(1, "rose");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString(1));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	public static void main(String arg[]){
		ConnectionObj conObj = new ConnectionObj();
		conObj.getConnection();
	}
}
