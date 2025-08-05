package com.coursecube.jdbc;
import java.sql.*;
import com.classUtil.jdbc.JDBCUtil;


public class Lab8 {

	public static void main(String[] args) {
		Connection Con = null;
		Statement St = null;
		ResultSet rs= null;
		try {
			Con = JDBCUtil.getConnecttion();
			String Sql = "select * from mycustomers";
			St = Con.createStatement();
			rs= St.executeQuery(Sql);
			while(rs.next()) {
				int cid =rs.getInt(1);
				String cname = rs.getString(2);
				String email =rs.getString(3);
				int phone = rs.getInt(4);
				String city =rs.getString(5);
				System.out.println(cid+"\t\t"+cname+"\t\t"+email+"\t\t"+phone+"\t\t"+city);
			}
			System.out.println("----------------Done----------------");	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.clearUp(Con,St,rs);
		}

	}

}
