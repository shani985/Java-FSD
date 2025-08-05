package com.coursecube.jdbc;
import com.classUtil.jdbc.JDBCUtil;
import java.sql.*;

public class Lab13 {


	public static void main(String[] args) {
		Statement ps = null;
		 Connection Con = null;
		 int mycid=111;
		 String myname="sssr";
		 String myemail="srr@gmail.com";
		 int myphone=123004;
		 String mycity= "hydra";
		try{
			
		 Con = JDBCUtil.getConnecttion();
		String Sql ="insert into mycustomers value(?,?,?,?,?)";
		
	ps =Con.prepareCall(Sql);
	 int x = ps.executeUpdate();
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
