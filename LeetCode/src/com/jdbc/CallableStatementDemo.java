package com.jdbc;

import oracle.jdbc.OracleTypes;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementDemo {
    public static void main(String[] args) {
        Connection conn = null;
        CallableStatement stmt = null;
        ResultSet rs = null;
        Scanner sc;
        try {

            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

            String sql = "{CALL GET_EMP_DETAILS_BY_DEPT_NO(?, ?)}";
            stmt = conn.prepareCall(sql);
            sc = new Scanner(System.in);
            System.out.println("Enter emp dept number: ");
            int dno = sc.nextInt();

            stmt.setInt(1, dno);

            stmt.registerOutParameter(2, OracleTypes.CURSOR);

            stmt.execute();

            rs = (ResultSet) stmt.getObject(2);

            while (rs.next()) {
                String name = rs.getString("ENAME");
                String job = rs.getString("JOB");
                float salary = rs.getFloat("SAL");
                int deptno = rs.getInt("DEPTNO");
                Employee emp = new Employee(name, job, salary, deptno);
                System.out.println(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
