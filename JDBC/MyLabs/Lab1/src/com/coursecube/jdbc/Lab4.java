package com.coursecube.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import java.sql.*;

public class Lab4 {

	public static void main(String[] args) {
		
		try {
			// load the driver class 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//established the connection
			Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","shani");
			//prepare the sql query
			String Sql = "insert into mycustomers value(107,'zuber','zuber2635@.com',846746,'bareilly')";
			//create statement
			Statement St= Con.createStatement();
			//submit to DB
			int X = St.executeUpdate(Sql);
			//process result
			if(X==1) {
				System.out.println("Record insert is successfull");
			}else {
				System.out.println("record is not insert");
			}
			//close all the resource
			St.close();
			Con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
