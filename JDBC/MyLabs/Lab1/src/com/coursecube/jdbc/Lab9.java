package com.coursecube.jdbc;
import com.classUtil.jdbc.JDBCUtil;

import java.sql.*;

public class Lab9 {

	public static void main(String[] args) {
		Connection Con = null;
		Statement St =null;
		try {
			Con = JDBCUtil.getConnecttion();
			String Sql = "update mycustomers set city='meerganj' where cid=102";
			St = Con.createStatement();
			int x = St.executeUpdate(Sql);
			if(x==1) { 
				System.out.println("record update Succesfully");
			}else { 
				System.out.println("record is not update Succesfully");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			JDBCUtil.clearUp(Con, St);
		}
	}

}
