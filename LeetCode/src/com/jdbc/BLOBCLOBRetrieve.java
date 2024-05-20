package com.jdbc;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class BLOBCLOBRetrieve {

    public static void main(String[] args) throws SQLException, IOException {
        PreparedStatement ps = null;
        Connection conn = null;
        InputStream is = null;
        Reader fis = null;
        Writer fws = null;
        OutputStream os = null;
        ResultSet rs = null;
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
            System.out.println("Enter resource Name");
            String name = sc.next();
            ps = conn.prepareStatement("select * from job_seeker where name=?");
            ps.setString(1, name);
            rs = ps.executeQuery();
            os = new FileOutputStream("reddy.jpg");
            fws = new FileWriter("venkat.txt");
            if (rs.next()) {
                is = rs.getBinaryStream(4);
                fis = rs.getCharacterStream(3);
                IOUtils.copy(fis, fws);
                IOUtils.copy(is, os);
            }else{
                System.out.println("Resource Not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            fis.close();
            fws.close();
            is.close();
            os.close();
            rs.close();
            ps.close();
            conn.close();
        }
    }
}
