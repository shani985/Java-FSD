package com.coursecube.jdbc;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.*;

public class Lab1 {

	public static void main(String[] args) throws Exception {
		try {
			//load of driver class
			
			Class.forName("com.mysql.cj.jdbc.Driver");
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//step established the connection
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","shani"); 
			//prepare a Sql statement
			String SQL = "select * from mycustomers";
			
			Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery(SQL);
			
			//Step6: Process Result
			while(rs.next()) {
				int cid = rs.getInt(1);
				String cname = rs.getString(2);
				String email = rs.getString(3);
				int phone = rs.getInt(4);
				String city = rs.getString(5);
				System.out.println(cid+"\t"+cname+"\t\t"+email+"\t"+phone+"\t"+city);
			}
		
			System.out.println("-----Done--------");	// close the Resource
			st.close();
			rs.close();
			con.close();
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
