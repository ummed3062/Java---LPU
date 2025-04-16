package com.lpu.unit6.jdbc;

import java.sql.*;
public class StoredProcedureExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
            CallableStatement cstmt = con.prepareCall("{CALL getStudent(?)}");
            cstmt.setInt(1, 1);
            ResultSet rs = cstmt.executeQuery();


            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

