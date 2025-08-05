package com.coursecube.jdbc;
import com.classUtil.jdbc.JDBCUtil;
import java.sql.*;

public class Lab11 {


	public static void main(String[] args) {
		Statement St = null;
		 Connection Con = null;
		 int mycid=109;
		 String myname="rrrr";
		 String myemail="rr@gmail.com";
		 int myphone=1234;
		 String mycity= "hydrabaad";
		try{
			
		 Con = JDBCUtil.getConnecttion();
		String Sql =String.format("insert into mycustomers value(%d,'%s','%s',%d,'%s')",mycid,myname,myemail,myphone,mycity);
		
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
