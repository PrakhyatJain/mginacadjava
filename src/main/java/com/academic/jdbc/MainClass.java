package main.java.com.academic.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		Connection con = null;
		String query = "select * from employee";
		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
		
		
		
		try {
			con = DBConnection.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			//Setting the values to the Value object and 
			//adding it to arraylist
			while(rs.next()) {
				EmployeeVO employeeVO = new EmployeeVO();
				employeeVO.setId(rs.getInt("id"));
				employeeVO.setName(rs.getString("name"));
				employeeVO.setDesignation(rs.getString("designation"));
				employeeVO.setSalary(rs.getInt("salary"));
				employees.add(employeeVO);
			}
			
			employees.forEach(e -> {
				
				System.out.println("Employee Id : " + e.getId());
				System.out.println("Employee Name : " + e.getName());
				System.out.println("Employee Designation : " + e.getDesignation());
				System.out.println("Employee Salary : " + e.getSalary());
				System.out.println("------------------------");
			});
			
			
			

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
