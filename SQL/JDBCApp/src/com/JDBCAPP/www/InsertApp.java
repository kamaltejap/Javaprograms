package com.JDBCAPP.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertApp {
    public static void main(String[] args) 
	{	
		final String Driver="oracle.jdbc.driver.OracleDriver";
		final String url="jdbc:oracle:thin:@localhost:1521:XE";
		final String username="system";
		final String pass="admin";
		final String qry ="insert into student values(105,alan,mumbai)";
		
		try 
		{
			Class.forName(Driver);
			Connection con=DriverManager.getConnection(url,username,pass);
			Statement st=con.createStatement();
			
			int res=st.executeUpdate(qry);
			if(res==0) {
				System.out.println("Record not inserted");
			}
			
			else {
				System.out.println("Record inserted");
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

    
}
