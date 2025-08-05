package com.coursecube.jdbc;
import com.classUtil.jdbc.JDBCUtil;
import java.sql.*;

public class Lab7 {

	 Statement St = null;
	 Connection Con = null;

	public static void main(String[] args) {
		Statement St = null;
		 Connection Con = null;
		try{
			
		 Con = JDBCUtil.getConnecttion();
		String Sql = "insert into mycustomers value(108,'Adaresh','adra1234@.com',8735363,'meerganj')";
		St =Con.createStatement();
		int x=St.executeUpdate(Sql);
		if(x==1) {
			System.out.println("Customer Record is inserted succesfully");
		}else {
			System.out.println("Customer Record is not  inserted");
		}
	}catch(Exception e) {
		e.printStackTrace();	
	}finally {
		JDBCUtil.clearUp(Con,St);
	}
	}
}
