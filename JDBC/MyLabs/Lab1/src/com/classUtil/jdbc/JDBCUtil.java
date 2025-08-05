package com.classUtil.jdbc;
import java.sql.*;
public class JDBCUtil {
public static Connection getConnecttion() {
	Connection con=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con =DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","shani");
	}catch(Exception e) {
		e.printStackTrace();
	}
	return con;
	
}
public static void clearUp(Connection con,Statement st) {
	try {
		if(st!=null) {
			st.close();
		}
		if(con != null) {
			con.close();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
public static void clearUp(Connection con,Statement st,ResultSet rs) {
	try {
		if(st!=null) {
			st.close();
		}
		if(con != null) {
			con.close();
		}
		if(rs != null) {
			rs.close();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}


