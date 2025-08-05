package com.coursecube.jdbc;
import java.sql.*;
public class Lab10 {
public static void main(String []args) {
	Connection Con=null;
	Statement St = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","shani");
		String Sql = "delete from mycustomers where cid =107";
		 St = Con.createStatement();
		int x = St.executeUpdate(Sql);
		if(x==1) {
			System.out.println("record is  deleted succesfuuly");
		}else {
			System.out.println("record is not deleted");
		}
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	finally {
		try {
		Con.close();
		St.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
}
