package com.coursecube.jdbc;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Lab12 {

	public static void main(String[] args) {
		Connection Con=null;
		Statement St =null;
		ResultSet rs=null;
		String mycity="hydrabaad";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","shani");
			String Sql =String.format("select * from mycustomers where city='%s'", mycity) ;
			System.out.println(Sql);
			 St = Con.createStatement();
			  rs= St.executeQuery(Sql);
			while(rs.next())
			{
				int cid =rs.getInt(1);
				String cname = rs.getString(2);
				String email = rs.getString(3);
				int ph=rs.getInt(4);
				String city= rs.getString(5);
				System.out.println(cid+"\t\t"+cname+"\t\t"+email+"\t\t"+ph+"\t\t"+city);
				
			}
			System.out.println("--------DONE------------");
			
		}catch(Exception e){
			e.printStackTrace();			
		}finally {
			try {
				if(St!=null) {
					
					St.close();
				}
				if(Con!=null) {
					Con.close();
				}
				if(rs!=null) {
					rs.close();
				}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
