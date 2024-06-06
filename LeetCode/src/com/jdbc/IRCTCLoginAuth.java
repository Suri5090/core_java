package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class IRCTCLoginAuth {

    public static void main(String[] args) throws SQLException {

        String query = "{call IRCTC_LOGIN_AUTH(?, ?, ?)}";
        CallableStatement cs = null;
        Scanner sc;
        try(Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger")){
            if(conn!=null){
                cs = conn.prepareCall(query);
                sc = new Scanner(System.in);
                System.out.println("Enter user name");
                String name = sc.next();
                System.out.println("Enter user password");
                String pwd = sc.next();
                cs.registerOutParameter(3, Types.VARCHAR);
                cs.setString(1, name);
                cs.setString(2, pwd);
                cs.execute();
                String result = cs.getString(3);
                System.out.println(result);
            }
        }
    }
}
