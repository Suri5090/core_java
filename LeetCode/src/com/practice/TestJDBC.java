package com.practice;

import java.sql.*;  
public class TestJDBC{  
    public static void main(String[] args){
    	try{  
    		Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Loaded Driver");
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			System.out.println("Got Connection");
			conn.close();
			System.out.println("Connection Closed");
    	}
    	catch(Exception e){
    		System.out.println(e.getMessage());
    	}
    }  
}