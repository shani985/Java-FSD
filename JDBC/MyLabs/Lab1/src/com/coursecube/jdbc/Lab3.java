package com.coursecube.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;



public class Lab3 {
	public static void main(String args[]) throws Exception {
		try {
			//load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			//established the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","shani");
			//prepare the sql query
			String sql="insert into mycustomers value(103,'nikhi','nikhil@123.com',65746,'bareilly')";
			//Create the statement
			Statement st = con.createStatement();
			//submit SQL to DB
			int x = st.executeUpdate(sql);
			//process result
			if(x==1) {
				System.out.println("Record inserted is successful");
			}else {
				System.out.println("Record is not inserted");
			}
			//close all resourse
			st.close();
			con.close();
			}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
	

}
