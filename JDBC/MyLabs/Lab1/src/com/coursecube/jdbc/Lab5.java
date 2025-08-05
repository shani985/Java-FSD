package com.coursecube.jdbc;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab5 {

	public static void main(String[] args) {
		
		try { 
			//load the class
			Class.forName("com.mysql.cj .jdbc.Driver");
			//established the connection
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","shani");
			//prepare the Sql statement
			String Sql = "select * from mycustomers";
			//create the statements
			Statement st = Con.createStatement();
			//submit to sql to DB
			ResultSet rs=st.executeQuery(Sql);
			//process result
			while(rs.next()) {
				int cid = rs.getInt(1);
				String cname=rs.getString(2); 
				String email = rs.getString(3);
				int ph = rs.getInt(4);
				  String city = rs.getString(5);
				System.out.println(cid+"\t\t"+cname+"\t\t"+email+"\t\t"+ph+"\t\t"+city);
			}
			System.out.println("-------Done---------");
			Con.close();
			st.close();
			rs.close();
			
		}catch(Exception s) {
			s.printStackTrace();
			
			
		}

	}

}
