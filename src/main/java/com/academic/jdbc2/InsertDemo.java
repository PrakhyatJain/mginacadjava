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
public class InsertDemo {
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
					"jdbc:mysql://localhost/megainfoware", "root", "admin");
			String query = "insert into emp_details values ('MI1001','Rose','marry', 'rose@yahoo.com','9876534567','Bangalore')";
			smt = con.createStatement();
			i = smt.executeUpdate(query);
			System.out.println("Values inserted "+i);

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		InsertDemo t = new InsertDemo();
		t.Demo();

	}

}
