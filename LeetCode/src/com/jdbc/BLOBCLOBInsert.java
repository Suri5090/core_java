package com.jdbc;

import java.io.*;
import java.sql.*;

public class BLOBCLOBInsert {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        PreparedStatement ps = null;
        Connection conn = null;
        InputStream is = null;
        Reader rs = null;
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
            ps = conn.prepareStatement("insert into job_seeker values(?,?,?,?)");
            ps.setString(1, "Suresh");
            ps.setString(2, "Badvel");
            rs = new FileReader("D:\\BLOBCLOB\\resume.txt");
            ps.setClob(3, rs);
            is = new FileInputStream("D:\\BLOBCLOB\\photo.jpg");
            ps.setBlob(4, is);
            int count = ps.executeUpdate();
            if(count>0){
                System.out.println("profile has been inserted");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            ps.close();
            is.close();
            conn.close();
        }
    }
}
