package com.coursecube.jdbc;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.*;

public class Lab2 {

	public static void main(String[] args) throws Exception {
		try {
			//load of driver class
			
			Class.forName("com.mysql.cj.jdbc.Driver");
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//step established the connection
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","shani"); 
			//prepare a sql statement
			String SQL="insert into mycustomers value(102,'shani','shani@123',6454,'bareilly')";
			// create  the jdbc statement 
			Statement st = con.createStatement();
			//submit SQL to DB
			int X= st.executeUpdate(SQL);
			//process result 
			if(X==1) {
				System.out.println(" Customer Record is Inserted Succesfully");
			}else {
				System.out.println(" Customer Record is not Inserted Succesfully");
			}
			// close the Resource
			st.close();
			con.close();
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		

	}

}
