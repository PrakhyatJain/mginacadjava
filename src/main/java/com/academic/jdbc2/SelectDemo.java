package main.java.com.academic.jdbc2;
import java.sql.*;
/**
 * @author Ramesh Karuti
 * 
 */
public class SelectDemo {
	Connection con;
	Statement smt;
	ResultSet rs;
	public boolean selectDemo(String inputName , String password) {
		String name = null;
		String pass=null;
		boolean flag = false;
		//String inputName = "Rose";;
		System.out.println("Name pass are "+inputName + " "+password);
		try {
			Class.forName("com.mysql.jdbc.Driver");  //1
			con = DriverManager.getConnection("jdbc:mysql://localhost/megainfo", "root", ""); //2
			smt = con.createStatement();  //3
			rs = smt.executeQuery("select * from demo");  //4
			while (rs.next()) {  //5
				name = rs.getString(1);
				pass = rs.getString(2);
				//System.out.println("The name and password is " + num + " "+ name);
				if((name.equalsIgnoreCase(inputName)) && (pass.equalsIgnoreCase(password))){
					flag = true;
					break;
				}
				else{
					flag = false;
				}
			}
			if(flag){
				System.out.println("Success "+name);
			}
			else{
				System.out.println("Invalid "+name);
			}
			rs.close();
			smt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	public static void main(String[] args) throws Exception {
		SelectDemo t = new SelectDemo();
		t.selectDemo("sanvi","567");
	}

}
